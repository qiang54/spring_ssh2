package com.test.service;

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

	public void save(Customer customer) {
		System.out.println("service层:保存客户...");
		customerDao.save(customer);
	}


}
