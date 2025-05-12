package com.infobeans.Model;
public class Student {
@Override
	public String toString() {
		return "Student [name=" + name + ", fname=" + fname + ", DOB=" + DOB + ", Address=" + Address + ", phone="
				+ phone + ", email=" + email + ", Class1=" + Class1 + ", aadhar=" + aadhar + ", rollno=" + rollno
				+ ", course=" + course + ", tid=" + tid + ", course_id=" + course_id + "]";
	}

private String  name ;
private String fname;
private  String DOB;
private  String Address;
private  long phone;
private  String email;
private  String Class1 ;
private  long aadhar;
private  long rollno;
private  String course;
private long tid;
private long course_id;
public long getCourse_id() {
	return course_id;
}
public void setCourse_id(long course_id) {
	this.course_id = course_id;
}
public long getTid() {
	return tid;
}
public void setTid(long tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String DOB) {
	this.DOB = DOB;
}
public String getAddress() {
	return Address;
}
public void setAddress(String Address) {
	this.Address = Address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getClass1() {
	return Class1;
}
public void setClass(String Class1) {
	this.Class1 = Class1;
}
public long getAadhar() {
	return aadhar;
}
public void setAadhar(long aadhar) {
	this.aadhar = aadhar;
}
public long getRollno() {
	return rollno;
}
public void setRollno(long rollno) {
	this.rollno = rollno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}

public Student(String name, String fname, String DOB, String 
		Address, long phone, String email, String Class1,
		long aadhar, long rollno, String course,long tid,long course_id) {
	super();
	this.name = name;
	this.fname = fname;
	this.DOB = DOB;
	this.Address = Address;
	this.phone = phone;
	this.email = email;
	this.Class1 = Class1;
	this.aadhar = aadhar;
	this.rollno = rollno;
	this.course = course;
	this.tid=tid;
	this.course_id=course_id;
}
}
