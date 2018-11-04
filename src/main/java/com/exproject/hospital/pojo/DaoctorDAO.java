package com.exproject.hospital.pojo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoctorDAO extends JpaRepository<Doctor,Integer>{
	@Query("select d.speci,d.name from Medication m join m.medisan me "+
			"join m.comdet c "+
			"join c.disease di "+
			"join c.visit v "+
			"join v.doctor d "+
			"join v.app a "+
			"join a.a_patient ap "+
			"where d.name=?1")
	

	List<Object[]> getDiseaseByDoctor(String name);

}
