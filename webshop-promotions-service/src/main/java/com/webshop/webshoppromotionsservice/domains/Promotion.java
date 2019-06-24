package com.webshop.webshoppromotionsservice.domains;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promotion {

    private String storeName;
    private double priceReduction;
    @Id
    private String code;

    public Promotion() {
    }

    public Promotion(String storeName, double priceReduction, String code) {
        this.storeName = storeName;
        this.priceReduction = priceReduction;
        this.code = code;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPriceReduction() {
        return priceReduction;
    }

    public void setPriceReduction(double priceReduction) {
        this.priceReduction = priceReduction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
