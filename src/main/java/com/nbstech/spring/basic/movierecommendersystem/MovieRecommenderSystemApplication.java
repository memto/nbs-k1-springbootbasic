package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lesson2.CollaborativeFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lesson2.MovieRecommender;
import com.nbstech.spring.basic.movierecommendersystem.Lesson2.ContentBasedFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// passing name of the filter as constructor argument
//		MovieRecommender recommender = new MovieRecommender(new ContentBasedFilter());
		MovieRecommender recommender = new MovieRecommender(new CollaborativeFilter());

		// call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		// display results
		System.out.println(Arrays.toString(result));
	}

}
