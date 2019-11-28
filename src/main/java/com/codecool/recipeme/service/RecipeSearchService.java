package com.codecool.recipeme.service;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.model.generated.HitsItem;
import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.model.generated.Response;
import com.codecool.recipeme.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecipeSearchService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getRecipesBySearch(Search search) throws IllegalAccessException, NoSuchFieldException {
        Response response = recipeRepository.getResponse(search);
        return response.getHits().stream().map(HitsItem::getRecipe).collect(Collectors.toList());
    }
}