package com.bluna.bluna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BlunaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlunaApplication.class, args);
    }

}
