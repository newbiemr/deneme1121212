package com.fisttech.finhist.service;

import com.fisttech.finhist.entity.Item;
import com.fisttech.finhist.model.ItemModel;
import com.fisttech.finhist.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {


    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItem(ItemModel item) {
        itemRepository.save(new Item(null, item.getType(), item.getPhysical(), item.getQuantity(), item.getQuantityType(), item.getAmount(), item.getCurrency(), item.getAdditionalAmount(), item.getTotalAmount(), item.getDescription(), item.getTransactionDate()));
    }
}