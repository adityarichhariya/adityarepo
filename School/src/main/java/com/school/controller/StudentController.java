package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Attribute;
import com.school.model.Student;
import com.school.service.StudentService;

@RequestMapping(value = "/student")
@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping(value = "create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student createStudent( @RequestBody Student s ) {
		return  service.addStudent(s);
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Student> listStudent() {
		return  service.listStudent(); 
	}

}