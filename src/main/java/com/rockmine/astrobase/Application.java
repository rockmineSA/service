package com.rockmine.astrobase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kkedari on 4/22/16.
 */
@SpringBootApplication
@ComponentScan
@PropertySource("classpath:astroBase.properties")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

