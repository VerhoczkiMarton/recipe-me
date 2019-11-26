package com.codecool.recipeme.model.database;

import com.codecool.recipeme.model.generated.IngredientsItem;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


@Entity
public class RecipeDB {

    @Id
    @GeneratedValue
    long id;

    @JsonProperty("image")
    private String image;

    @ElementCollection
    @JsonProperty("healthLabels")
    private List<String> healthLabels;

    @JsonProperty("totalTime")
    private double totalTime;

    @JsonProperty("label")
    private String label;

    @JsonProperty("source")
    private String source;

    @JsonProperty("calories")
    private double calories;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("url")
    private String url;

    @ElementCollection
    @JsonProperty("dietLabels")
    private List<String> dietLabels;

    @JsonProperty("totalWeight")
    private double totalWeight;

    @ElementCollection
    @JsonProperty("ingredients")
    private List<IngredientsItem> ingredients;

    @ElementCollection
    @JsonProperty("ingredientLines")
    private List<String> ingredientLines;

    protected RecipeDB(String image, List<String> healthLabels, double totalTime, String label, String source, double calories, String uri, String url, List<String> dietLabels, double totalWeight, List<IngredientsItem> ingredients, List<String> ingredientLines) {
        this.image = image;
        this.healthLabels = healthLabels;
        this.totalTime = totalTime;
        this.label = label;
        this.source = source;
        this.calories = calories;
        this.uri = uri;
        this.url = url;
        this.dietLabels = dietLabels;
        this.totalWeight = totalWeight;
        this.ingredients = ingredients;
        this.ingredientLines = ingredientLines;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<IngredientsItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientsItem> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }
}
