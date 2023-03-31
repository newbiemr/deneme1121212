package com.fisttech.finhist.service;

import com.fisttech.finhist.model.Record;
import com.fisttech.finhist.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    private RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> gelAll() {
        return recordRepository.findAll();
    }

    public String createTest(Record record) {
        return recordRepository.save(record).toString();

    }
}
