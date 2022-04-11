package com.example.student.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.example.student.dao.StudentDao;
import com.example.student.model.Student;
import com.mongodb.client.result.UpdateResult;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<Student> getAllStudents() {
		return mongoTemplate.findAll(Student.class);
	}
	
	public List<Student> getStudentsByName(String name){
		Query query=new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(query, Student.class);
	}
	
	public void create(Student students) {
		mongoTemplate.save(students);
	}
	
	public void updatePercentage(String rollno,Integer percentage) {
		Query query=new Query();
		query.addCriteria(Criteria.where("rollno").is(rollno));
		Update update=new Update();
		update.set("percentage", percentage);
		UpdateResult updateFirst = mongoTemplate.updateFirst(query, update, Student.class);
		System.out.print("Records Updated"+updateFirst);
		
	}
	
	public List<Student> getStudentsByPercentage(Integer percentage){
		Query query=new Query();
		query.addCriteria(Criteria.where("percentage").gte(percentage));
		return mongoTemplate.find(query, Student.class);
	}
	
	

	
}
