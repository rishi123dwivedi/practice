package com.example.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentDao;
import com.example.student.model.Student;
import com.example.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public List<Student> getStudentsByName(String name){
		return studentDao.getStudentsByName(name);
	}
	
	public void create(Student students){
		studentDao.create(students);
	}
	
	public void updatePercentage(String rollno,Integer percentage){
		 studentDao.updatePercentage(rollno,percentage);
	}
	
	public List<Student> getStudentsByPercentage(Integer percentage){
		List<Student> studentsByPercentage = studentDao.getStudentsByPercentage(percentage);
		return studentsByPercentage;
	}

}
