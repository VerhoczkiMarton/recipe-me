package com.codecool.recipeme.repository;

import com.codecool.recipeme.model.database.RecipeDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShoppingCartRepository extends JpaRepository<RecipeDB, Long> {
    public List<RecipeDB> findAll();
}
