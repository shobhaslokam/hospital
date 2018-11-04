package com.exproject.hospital.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class patient {
	@Id
	@GeneratedValue
private Long id;
private String name;
private Date  dob;
private Integer phno;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPhno() {
	return phno;
}
public void setPhno(Integer phno) {
	this.phno = phno;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
}
