package com.example.controller;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public String listAllCustomers(Model model) throws JsonProcessingException {
        List<Customer> customerList = customerRepository.findAll();

        model.addAttribute("customerList", customerList);

        customerList.forEach(e -> System.out.println("ID " + e.getCustomerID() + "Name: " + e.getName() + "City: " + e.getCity()));

        return convertListToJson(customerList);
        // return "customers";
    }

    private String convertListToJson(List<Customer> customerList) throws JsonProcessingException {
        //Object to JSON in String
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(customerList);
    }
}
