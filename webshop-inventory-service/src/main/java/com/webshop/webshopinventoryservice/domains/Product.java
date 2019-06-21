package com.webshop.webshopinventoryservice.domains;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String desc;
    private double basePrice;
    private double actualPrice;     // Not stored, automatically filled in.
    private List<Store> stores;     // Not stored, automatically filled in.

    public Product() {
    }

    public Product(String name, String desc, double basePrice) {
        this.name = name;
        this.desc = desc;
        this.basePrice = basePrice;
        this.actualPrice = basePrice;   // Set to default price if no promotions are found.

        stores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
