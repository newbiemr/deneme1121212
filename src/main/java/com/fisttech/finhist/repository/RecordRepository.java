package com.fisttech.finhist.repository;

import com.fisttech.finhist.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Long> {
//    @Query("select distinct type from finhist;")
//    List<String> getAllTypes();
}