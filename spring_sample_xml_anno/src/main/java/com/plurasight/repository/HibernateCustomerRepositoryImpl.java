package com.plurasight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.plurasight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Adam");
		customer.setLastname("Popielarz");
		
		customers.add(customer);
		 return customers;
		
	}
	
}
