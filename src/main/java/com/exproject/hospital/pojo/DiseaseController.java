package com.exproject.hospital.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Disease")
public class DiseaseController {
	

		@Autowired
		private DiseaseDAO  dao;
		@PostMapping("/one")
	public void savaDisease(@RequestBody Disease dis) {
		dao.save(dis);
			
		}
}
