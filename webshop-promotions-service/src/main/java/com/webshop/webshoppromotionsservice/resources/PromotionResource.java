package com.webshop.webshoppromotionsservice.resources;

import com.webshop.webshoppromotionsservice.domain.Promotion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionResource {

    /**
     * Get all currently active promotions of all stores.
     * @return List of promotions.
     */
    @RequestMapping("")
    public List<Promotion> getPromotions() {
        List<Promotion> promotions = new ArrayList<>();
        promotions.add(new Promotion("Jumbo", 0.2, "20PERCENTOFF"));

        return promotions;
    }

    /**
     * Get all active promotions for one specific store.
     * @param storeName Store to search relevant promotions for.
     * @return List of promotions.
     */
    @RequestMapping("/{storeName")
    public List<Promotion> getPromotionsByStore(@PathVariable("storeName") String storeName) {
        return null;
    }

}
