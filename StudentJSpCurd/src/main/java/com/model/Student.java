package com.model;

public class Student {
	int roll;
	String name;
	String course;
	String location;
	
	public Student() {
		super();
	}
	public Student(int roll, String name, String course, String location) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.location = location;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", course=" + course + ", location=" + location + "]";
	}
	
	
	

}
