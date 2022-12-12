package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig.MovieRecommender;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//== SPB way: ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//== Spring way: ApplicationContext manages the beans and dependencies
//		AnnotationConfigApplicationContext appContext =
//				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);


//		//use ApplicationContext to find which filter is being used
//		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
//
//		//call method to get recommendations
//		String[] result = recommender.recommendMovies("Finding Dory");
//
//		//display results
//		System.out.println(Arrays.toString(result));
//
//		appContext.close();


		//== XML App Config: load the configuration file
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		//check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		//retrieve bean from the application context
		MovieRecommender movieRecommender = appContext.getBean("movieRecommender", MovieRecommender.class);

		//call method to get recommendations
		String[] result = movieRecommender.recommendMovies("Finding Dory");

		//display results
		System.out.println();
		System.out.println(Arrays.toString(result));

		appContext.close();
	}
}
