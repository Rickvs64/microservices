package com.webshop.webshopstoresservice.resources;

import com.webshop.webshopstoresservice.domains.Store;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreResource {

    @RequestMapping("")
    public List<Store> getStores() {
        List<Store> stores = new ArrayList<>();
        List<String> productIds = new ArrayList<>();

        productIds.add("1");
        productIds.add("2");
        stores.add(new Store("Jumbo", productIds));

        return stores;
    }

    @RequestMapping("/{productId}")
    public List<Store> getStoresByProduct(@PathVariable("productId") String productId) {
        return null;
    }

}
