package com.example.springbootwithmssqlserver;
/**
 * Connect to Microsoft SQL Server from a Spring Boot application
 * There are two ways to connect it
 *      1. A Spring Boot console application with Spring JDBC and JdbcTemplate
 *      2. A Spring Boot web application with Spring Data JPA and Hibernate framework
 *
 *  In this example, we use Spring Boot console program that uses Spring JDBC with JdbcTemplate API
 */

import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//Method 1 - Enable this to run
//@SpringBootApplication
public class SpringBootWithMssqlServerApplication2 implements CommandLineRunner {

  //  @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithMssqlServerApplication2.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM Customer"; // Read data from the

        // We don’t need to explicitly make a connection or disconnection as the JdbcTemplate does it behind the scene
        List<Customer> customerList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Customer.class));

        customerList.forEach(e -> System.out.println("ID " + e.getCustomerID() + "Name: " + e.getName() + "City: " + e.getCity()));
    }
}
