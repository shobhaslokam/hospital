package com.exproject.hospital.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Complainte")
public class ComplaintController {
	@Autowired
			private ComplaintDAO  dao;
			@PostMapping("/one")
		public void savaComplaint(@RequestBody ComplaintDetails com) {
			List<Medication> melist=com.getMedilist();
			for (Medication medication : melist) {
				medication.setComdet(com);
				
			}
			dao.save(com);
			}
}
