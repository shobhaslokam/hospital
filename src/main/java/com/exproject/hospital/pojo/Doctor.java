package com.exproject.hospital.pojo;

import java.awt.Paint;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Doctor ")
public class Doctor{
private Integer id;
private String name;
private String speci;
@Id
@GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpeci() {
	return speci;
}
public void setSpeci(String speci) {
	this.speci = speci;
}

}
