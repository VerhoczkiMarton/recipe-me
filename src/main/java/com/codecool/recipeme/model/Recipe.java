package com.codecool.recipeme.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
    String uri;
    String label;
    String image;
    String url;
    List<Diet> dietLabels;
    List<Health> healthLabels;
    List<Ingredient> ingredients;
    Double calories;
    Double totalWeight;
    int totalTime;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Diet> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<Diet> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public List<Health> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<Health> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
