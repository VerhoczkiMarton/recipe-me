package com.codecool.recipeme.controller;

import com.codecool.recipeme.model.generated.Recipe;
import com.codecool.recipeme.repository.FavouriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FavouriteController {

    @Autowired
    private FavouriteRepository favouriteRepository;

    @RequestMapping("/save-to-favourite")
    public void saveFavourite(@RequestBody Recipe recipe){
        favouriteRepository.save(recipe);
    }
}
