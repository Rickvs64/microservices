package com.webshop.webshoppromotionsservice.resources;

import com.webshop.webshoppromotionsservice.domains.Promotion;
import com.webshop.webshoppromotionsservice.repositories.IPromotionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionResource {

    @Autowired
    private IPromotionRepo promotionRepo;

    /**
     * Get all currently active promotions of all stores.
     * @return List of promotions.
     */
    @RequestMapping("")
    public List<Promotion> getPromotions() {
        // findAll() returns an Iterable so we manually convert to List.
        List<Promotion> promotions = new ArrayList<>();
        promotionRepo.findAll().forEach(promotions::add);
        return promotions;
    }

    /**
     * Get all active promotions for one specific store.
     * @param storeName Store to search relevant promotions for.
     * @return List of promotions.
     */
    @RequestMapping("/{storeName}")
    public List<Promotion> getPromotionsByStore(@PathVariable("storeName") String storeName) {
        // findAll() returns an Iterable so we manually convert to List.
        // Pretty bad that we're using findAll() for a conditional query but okay.
        List<Promotion> allPromotions = new ArrayList<>();
        promotionRepo.findAll().forEach(allPromotions::add);


        List<Promotion> relevantPromotions = new ArrayList<>();

        for (Promotion p: allPromotions) {
            if (p.getStoreName().equals(storeName)) {
                relevantPromotions.add(p);
            }
        }

        return relevantPromotions;
    }

    /**
     * Generate dummy promotions (for Jumbo and Coolblue).
     * @return List of promotions.
     */
    private List<Promotion> generateDummyPromotions() {
        List<Promotion> promotions = new ArrayList<>();
        promotions.add(new Promotion("Jumbo", 0.2, "JUMBO20PERCENTOFF"));
        promotions.add(new Promotion("Jumbo", 0.3, "JUMBO30PERCENTOFF"));
        promotions.add(new Promotion("Coolblue", 0.1, "COOLBLUE10PERCENTOFF"));

        return promotions;
    }

}
