package com.example;
/**
 * Connect to Microsoft SQL Server from a Spring Boot application
 * There are two ways to connect it
 *      1. A Spring Boot console application with Spring JDBC and JdbcTemplate
 *      2. A Spring Boot web application with Spring Data JPA and Hibernate framework
 *
 *  In this example, we use A Spring Boot web application with Spring Data JPA and Hibernate framework
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithMssqlServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithMssqlServerApplication.class, args);
    }
}
