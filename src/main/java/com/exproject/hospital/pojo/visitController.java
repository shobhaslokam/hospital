package com.exproject.hospital.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("visit")
	public class visitController {
		@Autowired
		private visitDAO  dao;
		@PostMapping("/one")
		public void savavisit(@RequestBody visit visi) {
		dao.save(visi);
			
		}
}
