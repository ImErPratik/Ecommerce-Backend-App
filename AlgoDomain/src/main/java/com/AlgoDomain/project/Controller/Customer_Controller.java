package com.AlgoDomain.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AlgoDomain.project.Model.Customer;
import com.AlgoDomain.project.Service.Customer_Interface;


@RestController
public class Customer_Controller {
	
	@Autowired
	private Customer_Interface cust;
	
	@PostMapping("/algodomain/users")
	public ResponseEntity<Customer> storeUser(@RequestBody Customer customer){
		
		Customer cm = cust.addUser(customer);
	
		
		return new ResponseEntity<Customer>(cm, HttpStatus.OK);
	}

}
