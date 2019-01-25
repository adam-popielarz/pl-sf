package com.plurasight.repository;

import java.util.ArrayList;
import java.util.List;

import com.plurasight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.plurasight.repository.CustomerRepository#findAll()
	 */
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
