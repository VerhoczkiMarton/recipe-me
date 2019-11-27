package com.codecool.recipeme.controller;

import com.codecool.recipeme.model.Favourite;
import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.repository.FavouriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FavouriteController {

    @Autowired
    private FavouriteRepository favouriteRepository;

    @RequestMapping("/save-to-favourite")
    public void saveFavourite(@RequestBody Recipe recipe){

        Favourite favourite = Favourite.builder().userId(1L).recipes(Collections.singletonList(recipe)).build();
        recipe.setFavourite(favourite);
        favouriteRepository.save(favourite);

    }

    @RequestMapping("/favourites")
    public List<Recipe> getFavouriteRecipes() {
        List<Favourite> favourites = favouriteRepository.findByUserId(1L);
        List<Recipe> favouriteRecipes = new ArrayList<>();
        for (Favourite favourite : favourites) {
            favouriteRecipes.add((Recipe) favourite.getRecipes());
        }
        return favouriteRecipes;
    }

}
