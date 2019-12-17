package com.codecool.recipeme.service;

import com.codecool.recipeme.model.ShoppingCart;
import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.repository.RecipeRepository;
import com.codecool.recipeme.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getRecipesFromShoppingCart() {
        return recipeRepository.findAllByShoppingCartId(1L);
    }

    public void addRecipesToShoppingCart(Recipe recipe) {
        ShoppingCart shoppingCart = shoppingCartRepository.getOne(1L);
        recipe.setShoppingCart(shoppingCart);
        recipeRepository.saveAndFlush(recipe);
    }
}
