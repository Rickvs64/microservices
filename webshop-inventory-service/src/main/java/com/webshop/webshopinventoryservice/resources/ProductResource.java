package com.webshop.webshopinventoryservice.resources;

import com.webshop.webshopinventoryservice.domains.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inventory")
public class ProductResource {

    @RequestMapping("")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Snickers", "Individually wrapped.", 0.8));

        return products;
    }

}
