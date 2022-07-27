package com.AlgoDomain.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlgoDomain.project.Model.Customer;
import com.AlgoDomain.project.Repository.Customer_Repo;

@Service
public class Customer_Implementation implements Customer_Interface {
	
	@Autowired
	private Customer_Repo c_repo;

	@Override
	public Customer addUser(Customer customer) {
		
		return c_repo.save(customer);
	}

}
