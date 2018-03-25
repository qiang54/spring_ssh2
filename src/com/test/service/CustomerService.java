package com.test.service;

import java.util.List;

import com.test.domain.Customer;

public interface CustomerService {



	public void save(Customer customer);

	public void update(Customer customer);

	public Customer getById(long l);

	public List<Customer> findAll();

	public List<Customer> findAllByQBC();
}
