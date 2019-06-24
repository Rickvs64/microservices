package com.webshop.webshopstoresservice.resources;

import com.webshop.webshopstoresservice.domains.Promotion;
import com.webshop.webshopstoresservice.domains.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreResource {

    @Qualifier("getWebClientBuilder")
    @Autowired
    private WebClient.Builder wb;

    /**
     * Get all existing stores.
     * @return List of stores and their products in stock.
     */
    @RequestMapping("")
    public List<Store> getStores() {
        List<Store> stores = generateDummyStores();

        // Fill stores with promotions data from promotions service.
        for (Store s: stores) {
            s.setAvailablePromotions(loadPromotionsFromPromotionService(s.getName()));
        }

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

    /**
     * Generate dummy stores with products in stock (Jumbo and Coolblue).
     * @return List of stores with products.
     */
    public List<Store> generateDummyStores() {
        List<Store> stores = new ArrayList<>();
        List<String> products = new ArrayList<>();
        List<String> products2 = new ArrayList<>();

        products.add("Snickers");
        products.add("Mars");
        products.add("Bounty");
        products.add("Twix");
        stores.add(new Store("Jumbo", products));

        products2.add("Mouse");
        products2.add("Keyboard");
        products2.add("Laptop");
        products2.add("Tablet");
        stores.add(new Store("Coolblue", products2));

        return stores;
    }

    /**
     * Get all relevant promotions from promotions-service.
     * REST communication.
     * @param storeName Name of store to search promotions for.
     * @return List of potential promotions (coupons).
     */
    private List<Promotion> loadPromotionsFromPromotionService(String storeName) {
        try {
            return Arrays.asList(wb.build()
                    .get()
                    .uri("http://promotions-service/promotion/" + storeName)
                    .retrieve()
                    .bodyToMono(Promotion[].class)
                    .block());
        }
        catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>();
        }

    }

}
