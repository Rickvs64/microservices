package com.webshop.webshopinventoryservice.repositories;

import com.webshop.webshopinventoryservice.domains.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Integer> {
}
