package com.exproject.hospital.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visit")
public class visit {

	@Id
	@GeneratedValue
	private Integer id;
	private Date date_time;
	@OneToOne
	@JoinColumn(name="apid")
	private Appointment app;
	@ManyToOne
	@JoinColumn(name="did")
	private Doctor doctor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public Appointment getApp() {
		return app;
	}
	public void setApp(Appointment app) {
		this.app = app;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
