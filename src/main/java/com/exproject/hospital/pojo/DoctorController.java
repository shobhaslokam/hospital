package com.exproject.hospital.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Doctor")
public class DoctorController {
	@Autowired
	private DaoctorDAO  dao;
	
	@PostMapping("/one")
public void savaDoctor(@RequestBody Doctor doc) {
	dao.save(doc);
		
	}
	@GetMapping("/getDiseaseByDoctor/")
public List<Object[]> getDiseaseByDoctor(@PathVariable(name="name")String name){
		
		
		return dao.getDiseaseByDoctor(name);
	
	}
}

