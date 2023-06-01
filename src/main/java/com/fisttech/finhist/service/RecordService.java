package com.fisttech.finhist.service;

import com.fisttech.finhist.entity.Record;
import com.fisttech.finhist.repository.CustomNativeRepository;
import com.fisttech.finhist.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    private RecordRepository recordRepository;
    private CustomNativeRepository customNativeRepository;

    public RecordService(RecordRepository recordRepository,
                         CustomNativeRepository customNativeRepository) {
        this.recordRepository = recordRepository;
        this.customNativeRepository = customNativeRepository;
    }

    public List<Record> gelAll() {
        return recordRepository.findAll();
    }

    public String createTest(Record record) {
        return recordRepository.save(record).toString();

    }

    public List<String> gelAllTypes() {
        return customNativeRepository.runNativeQuery();

//        List<String> abc = new ArrayList<>();
//        abc.add("a");
//        abc.add("b");
//        abc.add("c");
//        return abc;

    }

    public void createRecod(Record record) {
        recordRepository.save(record);

    }
}
