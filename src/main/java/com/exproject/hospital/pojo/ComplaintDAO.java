package com.exproject.hospital.pojo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintDAO extends JpaRepository<ComplaintDetails, Long> {

}
