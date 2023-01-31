package com.testcon;

public class Student {
	private int rollNo;
	private String studentName;
	private Subject subject;
	private Address address;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void studentDetails() {
		System.out.println("Student Name: "+this.getStudentName());
		System.out.println("Roll Number: "+this.getRollNo());
		System.out.println("Subject: "+this.getSubject());
		System.out.println("Address: "+this.getAddress());
	}
}