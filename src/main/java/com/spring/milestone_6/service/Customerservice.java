package com.spring.milestone_6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.milestone_6.Entity.Customer;
import com.spring.milestone_6.Jpa.repo;

@Service
public class Customerservice {
	
	@Autowired
	private repo repository;
	
	public Customer addCustomer(Customer c) {
		return repository.save(c);
	}
	
	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Customer> getAllCustomer(){
		return repository.findAll();
	}
	
	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "deleted the data" +id;	
	}
	
	public Customer editCustomer(Customer c) {
		Customer existingCustomer = repository.findById(c.getId()).orElse(null);
		existingCustomer.setName(c.getName());
		existingCustomer.setAge(c.getAge());
		existingCustomer.setGender(c.getGender());
		return repository.save(existingCustomer);	
	}

}
