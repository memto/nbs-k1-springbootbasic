package com.nbstech.spring.basic.movierecommendersystem.ExternalProperty;

//@Component
//@Primary
public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        // implement logic of content based filter

        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}