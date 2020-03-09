package com.github.lbroudoux.fruits.catalog; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A Spring Boot application for launching our REST + Repository beans.
 * @author laurent
 */
@SpringBootApplication
public class FruitsCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitsCatalogApplication.class, args);
    }
}
