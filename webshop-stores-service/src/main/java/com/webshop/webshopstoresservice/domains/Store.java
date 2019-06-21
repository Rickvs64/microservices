package com.webshop.webshopstoresservice.domains;

import java.util.List;

public class Store {
    private String name;
    private List<String> availableProducts;

    public Store() {
    }

    public Store(String name, List<String> availableProducts) {
        this.name = name;
        this.availableProducts = availableProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List<String> availableProducts) {
        this.availableProducts = availableProducts;
    }
}
