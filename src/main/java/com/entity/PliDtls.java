package com.entity;

public class PliDtls {
	
	private int id;
	private String fname;
	private String course;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", fname=" + fname + ", course=" + course + ", status=" + status + "]";
	}
	

}
