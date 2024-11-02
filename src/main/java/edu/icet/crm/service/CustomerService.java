package edu.icet.crm.service;

import edu.icet.crm.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);

    List<Customer> getall();
}
