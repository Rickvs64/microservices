package com.webshop.webshopinventoryservice.resources;

import com.webshop.webshopinventoryservice.domains.Product;
import com.webshop.webshopinventoryservice.domains.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductResource {

    /**
     * Get ALL existing products with their current promotions and stores
     * @return List of products.
     */
    @RequestMapping("")
    public List<Product> getProducts() {
        // Get all products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Snickers", "Individually wrapped.", 0.8));

        // Let's pretend we get this data from store-service
        List<Store> stores = generateDummyStores();

        // Iterate through each product to add store info
        for (Product p: products) {

        }

        return products;
    }

    /**
     * Development method for generating two dummy stores (Jumbo and Coolblue).
     * @return Jumbo and Coolblue dummy data.
     */
    private List<Store> generateDummyStores() {
        List<Store> stores = new ArrayList<>();
        stores.add(new Store("Jumbo", Arrays.asList("1", "2", "3")));
        stores.add(new Store("Coolblue", Arrays.asList("4", "5", "6")));

        return stores;
    }

    private boolean doesStoreHaveInStock(Product p, Store s) {
        for (String productId: s.getAvailableProducts()) {
            if (productId.equals(p.getName())) {
                return true;
            }
        }
        return false;
    }

}
