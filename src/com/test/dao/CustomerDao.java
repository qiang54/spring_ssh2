package com.test.dao;

import com.test.domain.Customer;
/**
 * 接口：客户持久层
 * @author qiang
 *
 */
public interface CustomerDao {

	public void save(Customer customer);
}
