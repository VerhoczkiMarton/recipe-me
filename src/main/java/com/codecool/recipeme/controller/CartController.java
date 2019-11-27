package com.codecool.recipeme.controller;

import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping
    List<Recipe> getRecipes() {
        return shoppingCartService.getRecipesFromShoppingCart();
    }

    @PostMapping
    void addRecipe(@RequestBody Recipe recipe) {
        shoppingCartService.addRecipesToShoppingCart(recipe);
    }
}
