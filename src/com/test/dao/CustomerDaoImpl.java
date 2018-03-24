package com.test.dao;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.test.domain.Customer;
/**
 * 持久层
 * @author qiang
 *
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	/**
	 * 保存客户
	 */
	@Override
	public void save(Customer customer) {

		System.out.println("Dao层：保存用户...");
		this.getHibernateTemplate().save(customer);
	}

}
