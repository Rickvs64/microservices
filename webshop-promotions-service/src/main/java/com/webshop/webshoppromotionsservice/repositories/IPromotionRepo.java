package com.webshop.webshoppromotionsservice.repositories;

import com.webshop.webshoppromotionsservice.domains.Promotion;
import org.springframework.data.repository.CrudRepository;

public interface IPromotionRepo extends CrudRepository<Promotion, Integer> {

}
