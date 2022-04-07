package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@RestController
public class StudentRest {
	
	@Autowired
	StudentDao studentDao;
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Student student) {
		studentDao.save(student);
	}
	
	@GetMapping("/allStudent")
	public List<Student> allStudent() {
		return studentDao.findAll();
	}

}
