package edu.icet.crm.service.impl;

import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.model.Customer;
import edu.icet.crm.repository.CustomerRepository;
import edu.icet.crm.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;
    @Autowired
    ModelMapper mapper;

    @Override
    public void save(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getall() {
        ArrayList<Customer> customer = new ArrayList<>();
        for (CustomerEntity entity : repository.findAll()) {
            customer.add(mapper.map(entity, Customer.class));
        }
        return   customer;
    }
}
