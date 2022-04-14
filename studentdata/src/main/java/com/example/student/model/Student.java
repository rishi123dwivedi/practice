package com.example.student.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private String rollno;
	private Integer percentage;
	
	
	
	public Student() {
		super();
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRollno() {
		return rollno;
	}



	public void setRollno(String rollno) {
		this.rollno = rollno;
	}



	public Integer getPercentage() {
		return percentage;
	}



	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", percentage=" + percentage + "]";
	}
	
	
	
}
