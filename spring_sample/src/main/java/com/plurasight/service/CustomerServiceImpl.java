package com.plurasight.service;

import java.util.List;

import com.plurasight.model.Customer;
import com.plurasight.repository.CustomerRepository;
import com.plurasight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.plurasight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
