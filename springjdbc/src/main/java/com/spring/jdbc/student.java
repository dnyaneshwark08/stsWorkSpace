package com.spring.jdbc;

public class student {
	private int studentId;
	private String name;
	private String city;
	
	public student() {
		super();
		
	}

	public student(int studentId, String name, String city) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", name=" + name + ", city=" + city + "]";
	}
	

}
