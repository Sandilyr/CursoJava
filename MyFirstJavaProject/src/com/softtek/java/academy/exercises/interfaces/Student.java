package com.softtek.java.academy.exercises.interfaces;

public class Student implements Comparable<Student> {
	
	private int average;
	private String name;
	private int id;
	
	public Student(String name, int id, int average) {
		this.name = name;
		this.id = id;
		this.average = average;
		
	}
	
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Student student) {
		return this.average - student.average;
	}
	
	public String toString() {

		return "Student [name=" + name + ", ID=" + id + ", average=" + average + "]";
	}
	

}
