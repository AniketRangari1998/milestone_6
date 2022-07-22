package com.spring.milestone_6.customerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.milestone_6.Entity.Customer;
import com.spring.milestone_6.service.Customerservice;

@RestController
public class Customercontroller {
	
	@Autowired
	private Customerservice cs;
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer c) {
		return cs.addCustomer(c);
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return cs.getCustomerById(id);	
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return cs.getAllCustomer();
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return cs.deleteCustomer(id);
	}
	
	@PutMapping("/customers")
	public Customer editCustomer(Customer c) {
		return cs.editCustomer(c);	
	}

}
