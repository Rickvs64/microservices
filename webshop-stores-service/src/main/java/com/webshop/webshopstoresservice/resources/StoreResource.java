package com.webshop.webshopstoresservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreResource {

    @RequestMapping("")
    public List<Store> getStores() {

    }

}
