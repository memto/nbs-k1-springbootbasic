package com.nbstech.spring.basic.movierecommendersystem.Lesson3;

public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        // logic of collaborative based filter

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
