package com.example.student.service;

import java.util.List;

import com.example.student.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public List<Student> getStudentsByName(String name);

	public void create(Student students);

	public void updatePercentage(String rollno, Integer percentage);

	public List<Student> getStudentsByPercentage(Integer percentage);

}
