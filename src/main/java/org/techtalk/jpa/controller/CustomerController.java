package org.techtalk.jpa.controller;

import java.util.List;

import org.jpa.techtalk.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.techtalk.jpa.entity.Customer;
 
@RestController
@RequestMapping(produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping(value="/customer")
	public ResponseEntity<List<Customer>> findAllCustomer(){
		
		return new ResponseEntity<>(customerRepository.findAll(),HttpStatus.OK);
		
		
	}
	
	@PostMapping(value="/customer", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		
		return new ResponseEntity<>(customerRepository.save(customer),HttpStatus.OK);		
		
	}

}
