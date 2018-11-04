package com.exproject.hospital.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Medisan")
public class MedisanController {
	
		@Autowired
		private MedisanDAO  dao;
		@PostMapping("/one")
	public void savaMedisan(@RequestBody Medisan med) {
		dao.save(med);
			
		}
}
