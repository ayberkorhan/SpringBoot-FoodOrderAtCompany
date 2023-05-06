package com.example.foodDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FoodDileveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDileveryApplication.class, args);
		System.out.print("yemek");
	}

}
