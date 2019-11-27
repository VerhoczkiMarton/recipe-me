package com.codecool.recipeme.model;

import com.codecool.recipeme.model.generated.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ShoppingCart {
    @Id
    @GeneratedValue
    Long id;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    List<Recipe> recipes;

}
