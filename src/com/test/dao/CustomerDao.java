package com.test.dao;

import java.util.List;

import com.test.domain.Customer;
/**
 * 接口：客户持久层
 * @author qiang
 *
 */
public interface CustomerDao {

	public void save(Customer customer);

	public void update(Customer customer);

	public Customer getById(long l);

	public List<Customer> findAll();

	public List<Customer> findAllByQBC();
}
