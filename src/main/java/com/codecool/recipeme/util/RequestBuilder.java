package com.codecool.recipeme.util;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.service.RecipeSearch;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

public class RequestBuilder {
    @Autowired
    RecipeSearch recipeSearch;

    /**
     * Generates a MultiValueMap for the request based on the Search object.
     *
     * @param search Search object for the parameters
     * @return MultiValueMap for request parameters.
     * @throws IllegalAccessException
     */
    public static String getParameterMap(Search search) throws IllegalAccessException {
        String queryString = "?";
        Field[] fields = Search.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(search) != null) {
                queryString += field.getName() + "=" + (String) field.get(search) + "&";
            }
        }
        return queryString.substring(0, queryString.length() - 1);
    }
}
