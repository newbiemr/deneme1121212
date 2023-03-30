package com.fisttech.finhist.service;

import com.fisttech.finhist.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}