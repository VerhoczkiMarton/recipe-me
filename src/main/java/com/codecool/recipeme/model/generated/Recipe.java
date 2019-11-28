package com.codecool.recipeme.model.generated;

import com.codecool.recipeme.model.ShoppingCart;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Generated("com.robohorse.robopojogenerator")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ShoppingCart shoppingCart;

    @JsonProperty("image")
    private String image;

    @JsonProperty("shareAs")
    private String shareAs;

    @ElementCollection
    @JsonProperty("cautions")
    private List<String> cautions;

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

    @Transient
    @JsonProperty("totalNutrients")
    private TotalNutrients totalNutrients;

    @ElementCollection
    @JsonProperty("dietLabels")
    private List<String> dietLabels;

    @JsonProperty("yield")
    private double yield;

    @JsonProperty("totalWeight")
    private double totalWeight;

    @Transient
    @ElementCollection
    @JsonProperty("digest")
    private List<DigestItem> digest;

    @ElementCollection
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "recipe")
    @JsonProperty("ingredients")
    private List<IngredientsItem> ingredients;

    @ElementCollection
    @JsonProperty("ingredientLines")
    private List<String> ingredientLines;
}