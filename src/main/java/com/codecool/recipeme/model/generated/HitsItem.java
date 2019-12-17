package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class HitsItem {

    @JsonProperty("bookmarked")
    private boolean bookmarked;

    @JsonProperty("bought")
    private boolean bought;

    @JsonProperty("recipe")
    private Recipe recipe;

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return
                "HitsItem{" +
                        "bookmarked = '" + bookmarked + '\'' +
                        ",bought = '" + bought + '\'' +
                        ",recipe = '" + recipe + '\'' +
                        "}";
    }
}