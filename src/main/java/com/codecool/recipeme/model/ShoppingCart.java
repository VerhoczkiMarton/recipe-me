package com.codecool.recipeme.model;

import com.codecool.recipeme.model.generated.Recipe;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingCart")
    @ElementCollection
    List<Recipe> recipes;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
