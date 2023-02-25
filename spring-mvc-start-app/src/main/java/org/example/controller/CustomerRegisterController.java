package org.example.controller;

import org.example.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerRegisterController {

    @ModelAttribute("customer")
    public Customer registerCustomer() {
        return new Customer();
    }

    @RequestMapping(value = "/showRegisterForm", method = RequestMethod.GET)
    public String showForm() {
        return "customerRegisterForm";
    }


    @RequestMapping(value = "/registerCustomerForm", method = RequestMethod.POST)
    public String registerCustomer(@ModelAttribute("Customer") Customer customer, Model model) {

        model.addAttribute("message", "Customer Registration Success");
        model.addAttribute("customer", customer);

        return "registerSuccess";
    }
}
