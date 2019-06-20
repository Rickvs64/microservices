package com.webshop.webshoppromotionsservice.domain;

public class Promotion {

    private String storeId;
    private double priceReduction;
    private String code;

    public Promotion() {
    }

    public Promotion(String storeId, double priceReduction, String code) {
        this.storeId = storeId;
        this.priceReduction = priceReduction;
        this.code = code;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
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
