package com.exproject.hospital.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="medication")
public class Medication {
private Integer id;
private Medisan medisan;
private String howTtoUse;
private Integer qty;
private String  duration;
private ComplaintDetails comdet;
@Id
@GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

@ManyToOne
@JoinColumn(name="mid")
public Medisan getMedisan() {
	return medisan;
}
public void setMedisan(Medisan medisan) {
	this.medisan = medisan;
}


public String getHowTtoUse() {
	return howTtoUse;
}
public void setHowTtoUse(String howTtoUse) {
	this.howTtoUse = howTtoUse;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
@ManyToOne
@JoinColumn(name="cid")
public ComplaintDetails getComdet() {
	return comdet;
}
public void setComdet(ComplaintDetails comdet) {
	this.comdet = comdet;
}

}
