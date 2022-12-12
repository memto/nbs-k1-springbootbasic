package com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig;

public class MovieRecommender {
    private MovieFilter movieFilter;

    public MovieRecommender() {};

    public MovieRecommender(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    public MovieFilter getMovieFilter() {
        return movieFilter;
    }

    public void setMovieFilter(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        String[] results = movieFilter.getRecommendations("Finding Dory");

        return results;
    }
}
