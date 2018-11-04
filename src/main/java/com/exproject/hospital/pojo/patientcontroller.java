package com.exproject.hospital.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient")
public class patientcontroller {
	@Autowired
	private patientDAO  dao;
	@PostMapping("/all")
public void savapatients(@RequestBody List<patient> pat) {
	dao.save(pat);
	}
	@PostMapping("/one")
	public void savePatient(@RequestBody patient p) {
		dao.save(p);
	}
	
}
