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
     * Get ALL existing products with their current promotions and stores/
     * @return List of products.
     */
    @RequestMapping("")
    public List<Product> getProducts() {
        // Get all products
        List<Product> products = generateDummyProducts();

        // Let's pretend we get this data from store-service
        List<Store> stores = generateDummyStores();

        // Iterate through each product to add store info if available
        for (Product p: products) {
            for (Store s: stores) {
                if (doesStoreHaveInStock(p, s)) {
                    p.getStores().add(s);
                }
            }
        }

        return products;
    }

    /**
     * Get ALL existing products but WITHOUT any microservice communication.
     * @return List of products, not containing external info (stores, promotions).
     */
    @RequestMapping("/local")
    public List<Product> getProductsLocal() {
        // Get all products
        List<Product> products = generateDummyProducts();

        return products;
    }

    /**
     * Development method for generating two dummy stores (Jumbo and Coolblue).
     * @return Jumbo and Coolblue dummy data.
     */
    private List<Store> generateDummyStores() {
        List<Store> stores = new ArrayList<>();
        stores.add(new Store("Jumbo", Arrays.asList("Snickers", "Mars", "Bounty", "Twix")));
        stores.add(new Store("Coolblue", Arrays.asList("Mouse", "Keyboard", "Laptop", "Tablet")));

        return stores;
    }

    /**
     * Development method for generating dummy products.
     * @return Dummy products (Candy bars and hardware).
     */
    private List<Product> generateDummyProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Snickers", "Individually wrapped.", 0.8));
        products.add(new Product("Bounty", "Individually wrapped.", 0.6));
        products.add(new Product("Laptop", "Not designed for gaming.", 400.0));

        return products;
    }

    /**
     * Check whether a particular store has a specific product in stock.
     * @param p Product in stock.
     * @param s Store to search in.
     * @return True or false depending on product availability.
     */
    private boolean doesStoreHaveInStock(Product p, Store s) {
        for (String productId: s.getAvailableProducts()) {
            if (productId.equals(p.getName())) {
                return true;
            }
        }
        return false;
    }

}
