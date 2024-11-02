package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService service;

    @PostMapping("save")
    void savecustomer(@RequestBody Customer customer){
        service.save(customer);
    }

    @GetMapping("/getall")
    List<Customer>getall(){
        List<Customer> getall = service.getall();
        return getall;
    }
}
