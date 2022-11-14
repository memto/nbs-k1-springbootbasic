package com.nbstech.spring.basic.movierecommendersystem.Lesson2;

public class MovieRecommender {
    // use MovieFilter interface to select filter
    MovieFilter movieFilter;

    public MovieRecommender(MovieFilter movieFilter) {
        super();
        this.movieFilter = movieFilter;
    }

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        String[] results = movieFilter.getRecommendations("Finding Dory");

        return results;
    }
}
