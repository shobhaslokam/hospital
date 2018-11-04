package com.exproject.hospital.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ComplaintDetails")
public class ComplaintDetails {
private Long id;
private String description;
private List<Disease> disease;
private visit visit;
private List<Medication> medilist; 


@Id
@GeneratedValue
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@OneToMany(mappedBy="comdet" , cascade=CascadeType.ALL)

public List<Medication> getMedilist() {
	return medilist;
}
public void setMedilist(List<Medication> medilist) {
	this.medilist = medilist;
}
@ManyToOne
@JoinColumn(name="vid")
public visit getVisit() {
	return visit;
}
public void setVisit(visit visit) {
	this.visit = visit;
}
@ManyToMany
@JoinTable(
		name="com_vis",
		joinColumns={@JoinColumn(name="cid")},
		inverseJoinColumns={@JoinColumn(name="disid")})
public List<Disease> getDisease() {
	return disease;
}
public void setDisease(List<Disease> disease) {
	this.disease = disease;
}



}



