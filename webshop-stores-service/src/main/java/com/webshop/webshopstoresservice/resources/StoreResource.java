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

    /**
     * Get all existing stores.
     * @return List of stores and their products in stock.
     */
    @RequestMapping("")
    public List<Store> getStores() {
        List<Store> stores = new ArrayList<>();
        List<String> products = new ArrayList<>();

        products.add("Snickers");
        products.add("Mars");
        products.add("Bounty");
        products.add("Twix");
        stores.add(new Store("Jumbo", products));

        return stores;
    }

    /**
     * List of stores that have a specific product in stock.
     * @param productName Name of product.
     * @return List of stores.
     */
    @RequestMapping("/{productName}")
    public List<Store> getStoresByProduct(@PathVariable("productName") String productName) {
        return null;
    }

}
