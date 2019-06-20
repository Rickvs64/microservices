package com.webshop.webshopstoresservice.domains;

import java.util.List;

public class Store {
    private String name;
    private List<String> availableProductIds;

    public Store() {
    }

    public Store(String name, List<String> availableProductIds) {
        this.name = name;
        this.availableProductIds = availableProductIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAvailableProductIds() {
        return availableProductIds;
    }

    public void setAvailableProductIds(List<String> availableProductIds) {
        this.availableProductIds = availableProductIds;
    }
}
