package com.codecool.recipeme.util;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.service.RecipeSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

public class RequestBuilder {
    @Autowired
    RecipeSearchService recipeSearchService;

    /**
     * Generates a query string for the request based on the Search object.
     *
     * @param search
     * @return String of request parameters.
     * @throws IllegalAccessException
     */
    public static String getQueryString(Search search) throws IllegalAccessException {
        String queryString = "?";
        Field[] fields = Search.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(search) != null) {
                queryString += field.getName() + "=" + field.get(search).toString() + "&";
            }
        }
        return queryString.substring(0, queryString.length() - 1);
    }
}
