package com.codecool.recipeme.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search {
    String query;
    Diet diet;
    Health health;
    int caloriesFrom;
    int caloriesTo;
    int timeFromInMinutes;
    int timeToInMinutes;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public int getCaloriesFrom() {
        return caloriesFrom;
    }

    public void setCaloriesFrom(int caloriesFrom) {
        this.caloriesFrom = caloriesFrom;
    }

    public int getCaloriesTo() {
        return caloriesTo;
    }

    public void setCaloriesTo(int caloriesTo) {
        this.caloriesTo = caloriesTo;
    }

    public int getTimeFromInMinutes() {
        return timeFromInMinutes;
    }

    public void setTimeFromInMinutes(int timeFromInMinutes) {
        this.timeFromInMinutes = timeFromInMinutes;
    }

    public int getTimeToInMinutes() {
        return timeToInMinutes;
    }

    public void setTimeToInMinutes(int timeToInMinutes) {
        this.timeToInMinutes = timeToInMinutes;
    }
}
