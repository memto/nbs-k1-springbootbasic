package com.nbstech.spring.basic.movierecommendersystem.ExternalProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    // use MovieFilter interface to select filter
    @Autowired
    MovieFilter movieFilter;

    @Value("${movieRecommender.favoriteMovie: hello}")
    private String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }


    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        String[] results = movieFilter.getRecommendations("Finding Dory");

        return results;
    }
}
