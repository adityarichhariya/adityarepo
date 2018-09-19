package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student s) {

		return studentRepository.save(s);
	}

	public List<Student> listStudent() {
		return (List)studentRepository.findAll();
	}

}
