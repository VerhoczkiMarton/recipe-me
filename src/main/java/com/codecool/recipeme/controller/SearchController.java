package com.codecool.recipeme.controller;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.service.RecipeSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    RecipeSearch recipeSearch;

    /**
     * @param /search endpoint, Post request is needed with the must have key "q" as query string, and optionally [diet, health, calories, time]
     * @return List of recipes as JSON
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    @RequestMapping("/search")
    public List<Recipe> getResult(@RequestBody Search search) throws IllegalAccessException, NoSuchFieldException {
        List<Recipe> recipes = recipeSearch.getRecipesBySearch(search);
        return recipes;
    }
}
