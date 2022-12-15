package com.nbstech.spring.basic.movierecommendersystem.ExternalProperty;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        // logic of collaborative based filter

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
