package com.exproject.hospital.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class Appointment {
private Long id;
private Date date_time;
private String primary_reason;
private patient a_patient;
@Id
@GeneratedValue
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public Date getDate_time() {
	return date_time;
}
public void setDate_time(Date date_time) {
	this.date_time = date_time;
}
public String getPrimary_reason() {
	return primary_reason;
}
public void setPrimary_reason(String primary_reason) {
	this.primary_reason = primary_reason;
}
@ManyToOne
@JoinColumn(name ="pid")
public patient getA_patient() {
	return a_patient;
}
public void setA_patient(patient a_patient) {
	this.a_patient = a_patient;
}



}
