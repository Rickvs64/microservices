package com.webshop.webshoppromotionsservice.resources;

import com.webshop.webshoppromotionsservice.domain.Promotion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionResource {

    @RequestMapping("")
    public List<Promotion> getPromotions() {
        List<Promotion> promotions = new ArrayList<>();
        promotions.add(new Promotion("Jumbo", 0.2, "20PERCENTOFF"));

        return promotions;
    }

    @RequestMapping("/{storeId")
    public List<Promotion> getPromotionsByStore() {
        return null;
    }

}
