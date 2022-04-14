package com.example.student.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentRest {
	
	Logger logger = LoggerFactory.getLogger(StudentRest.class);

	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public String hello() {
		return "hello";
	}

	@GetMapping("/allStudent")
	public List<Student> getAllStudents() {
		List<Student> allStudents = null;
		try {
			allStudents = studentService.getAllStudents();
			logger.info("getAllStudents Data :{}", allStudents);
		} catch (Exception e) {
			logger.info("Error while getting data from getAllStudents :{}",e.getStackTrace());
		}
		return allStudents;
	}

	@GetMapping("/getStudentsByName")
	public List<Student> getStudentsByName(@RequestParam String name) {
		List<Student> studentsByName = null;
		try {
			studentsByName = studentService.getStudentsByName(name);
		} catch (Exception e) {
			logger.info("Error while getting data from getAllStudents :{}", e.getStackTrace());
		}
		return studentsByName;
	}

	@PostMapping("/create")
	public void create(@RequestBody Student students) {
		try {
			studentService.create(students);
		} catch (Exception e) {
			logger.info("Error while getting data from create :{}" , e.getStackTrace());
		}
	}

	@GetMapping("/updatePercentage")
	public void updatePercentage(@RequestParam String rollno, @RequestParam Integer percentage) {
		try {
			studentService.updatePercentage(rollno, percentage);
		} catch (Exception e) {
			logger.info("Error while getting data from updatePercentage :{}",  e.getStackTrace());
		}
	}

	@GetMapping("/getStudentsByPercentage")
	public List<Student> getStudentsByPercentage(@RequestParam Integer percentage) {
		List<Student> studentsByPercentage = null;
		try {
			studentsByPercentage = studentService.getStudentsByPercentage(percentage);
		} catch (Exception e) {
			logger.info("Error while getting data from updatePercentage :{}", e.getStackTrace());
		}
		return studentsByPercentage;
	}

}
