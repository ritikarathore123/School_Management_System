package com.infobeans.Model;

public class Teacher {
	private long tid;
	private String tname;
	private double salary;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public Teacher(long tid,String tname, double salary) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.salary = salary;
		}
	}

