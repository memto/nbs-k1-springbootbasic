package com.nbstech.spring.basic.movierecommendersystem.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    // use MovieFilter interface to select filter
    @Autowired
    MovieFilter movieFilter;

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        String[] results = movieFilter.getRecommendations("Finding Dory");

        return results;
    }
}
