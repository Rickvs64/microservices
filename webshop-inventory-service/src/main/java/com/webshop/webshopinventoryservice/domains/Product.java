package com.webshop.webshopinventoryservice.domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    private String name;
    private String description;
    private double basePrice;
    @Transient
    private double actualPrice;     // Not stored, automatically filled in.
    @Transient
    private List<Store> stores;     // Not stored, automatically filled in.

    public Product() {
        stores = new ArrayList<>();
    }

    public Product(String name, String description, double basePrice) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
