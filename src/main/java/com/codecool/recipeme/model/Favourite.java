package com.codecool.recipeme.model;

import com.codecool.recipeme.model.generated.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Favourite {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    public long userId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "favourite")
    @ElementCollection
    List<Recipe> recipes;

}
