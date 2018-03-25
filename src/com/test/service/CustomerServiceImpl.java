package com.test.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.test.dao.CustomerDao;
import com.test.domain.Customer;
/**
 * 持久层，客户
 * @author qiang
 *
 */

 @Transactional
public class CustomerServiceImpl implements CustomerService {

	 //不要忘记提供set方法
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		System.out.println("service层:保存客户...");
		customerDao.save(customer);
	}

	/**
	 * 更新客户
	 */
	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
	}

	/**
	 * 查询某一个客户
	 */
	@Override
	public Customer getById(long l) {
		
		return customerDao.getById(l);
	}
	/**
	 * 查询所有客户
	 */
	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	/**
	 * 离线条件查询
	 */
	@Override
	public List<Customer> findAllByQBC() {
		return customerDao.findAllByQBC();
	}


}
