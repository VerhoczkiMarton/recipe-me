package com.codecool.recipeme.repository;

import com.codecool.recipeme.model.Search;
import com.codecool.recipeme.model.generated.Response;
import com.codecool.recipeme.service.RecipeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.codecool.recipeme.util.RequestBuilder.getQueryString;

@Component
public class RecipeApiRepository implements ApiRepository {
    @Value("${api.url.recipe}")
    String apiUrl;

    @Value("${api.key.recipe}")
    String APIKEY;

    @Value("${api.id.recipe}")
    String APIID;

    @Autowired
    RecipeSearchService recipeSearchService;

    public Response getResponse(Search search) throws IllegalAccessException, NoSuchFieldException {
        RestTemplate restTemplate = new RestTemplate();
        String queryString = getQueryString(search);
        String credentialString = getApiCredentials();
        String url = new StringBuilder().append(apiUrl).append(queryString).append(credentialString).toString();
        Response response = restTemplate.getForObject(url, Response.class);
        return response;
    }

    @Override
    public String getApiKey() {
        return APIKEY;
    }

    @Override
    public String getApiId() {
        return APIID;
    }

    @Override
    public String getApiCredentials() {
        String credentialString = new StringBuilder().append("&app_id=").append(APIID).append("&app_key=").append(APIKEY).toString();
        return credentialString;
    }
}
