package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lesson3.CollaborativeFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lesson3.MovieRecommender;
import com.nbstech.spring.basic.movierecommendersystem.Lesson3.ContentBasedFilter;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

		//use ApplicationContext to find which filter is being used
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));

		appContext.close();
	}
}
