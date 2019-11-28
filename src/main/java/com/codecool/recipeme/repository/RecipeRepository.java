package com.codecool.recipeme.repository;

import com.codecool.recipeme.model.generated.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByShoppingCartId(Long id);

    List<Recipe> findAllByFavouriteId(Long id);

}
