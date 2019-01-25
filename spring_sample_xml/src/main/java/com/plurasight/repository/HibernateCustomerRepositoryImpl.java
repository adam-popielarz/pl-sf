package com.plurasight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.plurasight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Adam");
		customer.setLastname("Popielarz");
		
		customers.add(customer);
		 return customers;
		
	}


	
}
