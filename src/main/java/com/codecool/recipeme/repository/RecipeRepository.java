package com.codecool.recipeme.repository;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.model.generated.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static com.codecool.recipeme.util.RequestBuilder.getParameterMap;

@Component
public class RecipeRepository {
    private static final String apiUrl = "";

    public Response getResponse(Search search) throws IllegalAccessException {
        RestTemplate restTemplate = new RestTemplate();
        /*HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);*/
        MultiValueMap parameterMap = getParameterMap(search);
        HttpEntity request = new HttpEntity(parameterMap);
        ResponseEntity<Response> response = restTemplate.exchange(apiUrl, HttpMethod.GET, request, Response.class);
        return response.getBody();
    }
}
