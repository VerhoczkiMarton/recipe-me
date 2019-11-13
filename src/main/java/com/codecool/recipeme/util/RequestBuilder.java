package com.codecool.recipeme.util;

import com.codecool.recipeme.model.Search;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.lang.reflect.Field;

public class RequestBuilder {
    private static final String appId = "";
    private static final String appKey = "";

    /**
     * Generates a MultiValueMap for the request based on the Search object.
     *
     * @param search Search object for the parameters
     * @return MultiValueMap for request parameters.
     * @throws IllegalAccessException
     */
    public static MultiValueMap getParameterMap(Search search) throws IllegalAccessException {
        MultiValueMap<String, String> parameterMap = new LinkedMultiValueMap<>();
        Field[] fields = search.getClass().getFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(search) != null) {
                parameterMap.add(field.getName(), (String) field.get(search));
            }
        }
        parameterMap.add("app_id", appId);
        parameterMap.add("app_key", appKey);
        return parameterMap;
    }
}
