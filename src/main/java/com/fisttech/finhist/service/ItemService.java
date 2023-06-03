package com.fisttech.finhist.service;

import com.fisttech.finhist.entity.Item;
import com.fisttech.finhist.model.ItemModel;
import com.fisttech.finhist.model.restest.Randorecoruser;
import com.fisttech.finhist.model.restest.Randuser;
import com.fisttech.finhist.repository.ItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {


    private final ItemRepository itemRepository;
    private final RestTemplate rt;

    public ItemService(ItemRepository itemRepository, RestTemplate rt) {
        this.itemRepository = itemRepository;
        this.rt = rt;
    }

    public void createItem(ItemModel item) {
        itemRepository.save(new Item(null, item.getType(), item.getPhysical(), item.getQuantity(), item.getQuantityType(), item.getAmount(), item.getCurrency(), item.getAdditionalAmount(), item.getTotalAmount(), item.getDescription(), item.getTransactionDate()));
    }

    public Randuser test() {
        ResponseEntity<Randuser> response = rt.getForEntity(
                "https://random-data-api.com/api/v2/users",
                Randuser.class);
        Randuser randuser = response.getBody();



        return randuser;
    }

    public Randorecoruser test2() {
        ResponseEntity<Randorecoruser> response = rt.getForEntity(
                "https://random-data-api.com/api/v2/users",
                Randorecoruser.class);
        Randorecoruser randuser = response.getBody();



        return randuser;
    }
}