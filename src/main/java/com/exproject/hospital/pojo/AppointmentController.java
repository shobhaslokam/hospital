package com.exproject.hospital.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Appointment")
public class AppointmentController {
	@Autowired
		private AppointmentDAO dao;
	@PostMapping("/one")
	public void savaAppointment(@RequestBody Appointment  app) {
		dao.save(app);
			
		}
}
