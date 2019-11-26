package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Generated("com.robohorse.robopojogenerator")
public class IngredientsItem {

    @Id
    @GeneratedValue
    long id;

    @JsonProperty("weight")
    private double weight;

    @JsonProperty("text")
    private String text;

    protected IngredientsItem(double weight, String text) {
        this.weight = weight;
        this.text = text;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "IngredientsItem{" +
                        "weight = '" + weight + '\'' +
                        ",text = '" + text + '\'' +
                        "}";
    }
}