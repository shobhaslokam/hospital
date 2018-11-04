package com.exproject.hospital.pojo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseDAO extends JpaRepository<Disease,Integer> {

}
