package com.school.service;

import java.util.List;

import com.school.model.Student;

public interface StudentService {
	public Student addStudent(Student s);
	public List<Student> listStudent();
}