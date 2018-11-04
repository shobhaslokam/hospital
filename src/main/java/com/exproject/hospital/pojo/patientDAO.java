package com.exproject.hospital.pojo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface  patientDAO extends JpaRepository<patient, Integer>{
@Query("select ap.name,d.name,di.name from Medication m join m.medisan me "+
"join m.comdet c "+
"join c.disease di "+
"join c.visit v "+
"join v.doctor d "+
"join v.app a "+
"join a.a_patient ap "+
"where me.name=?1")

public List<Object[]> getPatientByMedisan(String name);
@Query("select ap.name,d.name,di.name from Medication m join m.medisan me "+
"join m.comdet c "+
"join c.disease di "+
"join c.visit v "+
"join v.doctor d "+
"join v.app a "+
"join a.a_patient ap "+
"where di.name=?1")
public List<Object[]> getPatientByDisease(String name);
public void save(List<patient> pat);
}