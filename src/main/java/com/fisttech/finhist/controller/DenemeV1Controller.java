package com.fisttech.finhist.controller;

import com.fisttech.finhist.entity.Record;
import com.fisttech.finhist.model.ItemModel;
import com.fisttech.finhist.service.ItemService;
import com.fisttech.finhist.service.RecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("deneme")
public class DenemeV1Controller {

    private RecordService recordService;
    private ItemService itemService;

    public DenemeV1Controller(RecordService recordService, ItemService itemService) {
        this.recordService = recordService;
        this.itemService = itemService;
    }

    @GetMapping("types")
    public List<String> getAllTypes() {
        return recordService.gelAllTypes();
    }

    @PostMapping("/")
    public String insertTest(/*@Valid */@RequestBody Record record) {
        recordService.createRecod(record);
        return "ok";
    }

    @PostMapping("/item")
    public String createItem(@RequestBody ItemModel item) {
        itemService.createItem(item);
        return "ok";
    }


}
