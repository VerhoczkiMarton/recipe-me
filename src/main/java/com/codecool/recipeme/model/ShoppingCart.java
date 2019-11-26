package com.codecool.recipeme.model;

import com.codecool.recipeme.model.database.RecipeDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    long id;

    @OneToOne
    RecipeDB recipeDB;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
