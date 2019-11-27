package com.codecool.recipeme.service;

import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public List<Recipe> getRecipesFromShoppingCart() {
        return shoppingCartRepository.findAll();
    }

    public void addRecipesToShoppingCart(Recipe recipe) {
        shoppingCartRepository.save(recipe);
    }
}
