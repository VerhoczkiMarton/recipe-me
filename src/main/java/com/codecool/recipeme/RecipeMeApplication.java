package com.codecool.recipeme;

import com.codecool.recipeme.model.ShoppingCart;
import com.codecool.recipeme.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class RecipeMeApplication {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public static void main(String[] args) {
        SpringApplication.run(RecipeMeApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCartRepository.saveAndFlush(shoppingCart);
        };
    }
}