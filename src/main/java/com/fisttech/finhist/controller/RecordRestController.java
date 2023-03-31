package com.fisttech.finhist.controller;

import com.fisttech.finhist.model.Record;
import com.fisttech.finhist.service.RecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1a")
public class RecordRestController {

    private RecordService recordService;

    public RecordRestController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping
    public List<Record> getAll(){
        return recordService.gelAll();
    }

    @PostMapping("/insertTest")
    public String insertTest(/*@Valid */@RequestBody Record record) {
        return recordService.createTest(record);
    }




}
