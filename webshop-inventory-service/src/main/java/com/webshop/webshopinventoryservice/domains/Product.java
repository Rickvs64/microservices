package com.webshop.webshopinventoryservice.domains;

import java.util.List;

public class Product {

    private String name;
    private String desc;
    private double basePrice;
    private List<Store> stores;

    public Product() {
    }

    public Product(String name, String desc, double basePrice) {
        this.name = name;
        this.desc = desc;
        this.basePrice = basePrice;
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

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
