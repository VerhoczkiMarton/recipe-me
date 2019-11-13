package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Recipe {

    @JsonProperty("image")
    private String image;

    @JsonProperty("shareAs")
    private String shareAs;

    @JsonProperty("cautions")
    private List<String> cautions;

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

    @JsonProperty("totalNutrients")
    private TotalNutrients totalNutrients;

    @JsonProperty("dietLabels")
    private List<String> dietLabels;

    @JsonProperty("yield")
    private double yield;

    @JsonProperty("totalWeight")
    private double totalWeight;

    @JsonProperty("digest")
    private List<DigestItem> digest;

    @JsonProperty("ingredients")
    private List<IngredientsItem> ingredients;

    @JsonProperty("totalDaily")
    private TotalDaily totalDaily;

    @JsonProperty("ingredientLines")
    private List<String> ingredientLines;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShareAs() {
        return shareAs;
    }

    public void setShareAs(String shareAs) {
        this.shareAs = shareAs;
    }

    public List<String> getCautions() {
        return cautions;
    }

    public void setCautions(List<String> cautions) {
        this.cautions = cautions;
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

    public TotalNutrients getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public List<String> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<DigestItem> getDigest() {
        return digest;
    }

    public void setDigest(List<DigestItem> digest) {
        this.digest = digest;
    }

    public List<IngredientsItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientsItem> ingredients) {
        this.ingredients = ingredients;
    }

    public TotalDaily getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
    }

    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    @Override
    public String toString() {
        return
                "Recipe{" +
                        "image = '" + image + '\'' +
                        ",shareAs = '" + shareAs + '\'' +
                        ",cautions = '" + cautions + '\'' +
                        ",healthLabels = '" + healthLabels + '\'' +
                        ",totalTime = '" + totalTime + '\'' +
                        ",label = '" + label + '\'' +
                        ",source = '" + source + '\'' +
                        ",calories = '" + calories + '\'' +
                        ",uri = '" + uri + '\'' +
                        ",url = '" + url + '\'' +
                        ",totalNutrients = '" + totalNutrients + '\'' +
                        ",dietLabels = '" + dietLabels + '\'' +
                        ",yield = '" + yield + '\'' +
                        ",totalWeight = '" + totalWeight + '\'' +
                        ",digest = '" + digest + '\'' +
                        ",ingredients = '" + ingredients + '\'' +
                        ",totalDaily = '" + totalDaily + '\'' +
                        ",ingredientLines = '" + ingredientLines + '\'' +
                        "}";
    }
}