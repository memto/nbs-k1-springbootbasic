package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.ExternalProperty.MovieRecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;


//@SpringBootApplication
@Configuration
//@ComponentScan
@ComponentScan(basePackages = "com.nbstech.spring.basic.movierecommendersystem.ExternalProperty")
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//== SPB way: ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//== Spring way: ApplicationContext manages the beans and dependencies
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);


		//use ApplicationContext to find which filter is being used
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);

		//display value read from external property file
//		String favoriteMovie = recommender.getFavoriteMovie();
//		System.out.println(favoriteMovie);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));

		appContext.close();
	}
}
