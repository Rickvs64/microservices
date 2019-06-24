package com.webshop.webshopstoresservice.repositories;

import com.webshop.webshopstoresservice.domains.Store;
import org.springframework.data.repository.CrudRepository;

public interface IStoreRepo extends CrudRepository<Store, Integer> {
}
