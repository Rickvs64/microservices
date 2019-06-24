package com.webshop.webshopstoresservice.domains;

import javax.persistence.*;
import java.util.List;

@Entity
public class Store {

    @Id
    private String name;
    @ElementCollection
    private List<String> availableProducts;
    @Transient
    private List<Promotion> availablePromotions;

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

    public List<Promotion> getAvailablePromotions() {
        return availablePromotions;
    }

    public void setAvailablePromotions(List<Promotion> availablePromotions) {
        this.availablePromotions = availablePromotions;
    }
}
