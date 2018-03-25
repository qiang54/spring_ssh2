package com.test.dao;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
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

	/**
	 * 更新客户
	 */
	@Override
	public void update(Customer customer) {

		this.getHibernateTemplate().update(customer);
	}

	/**
	 * 查找某一个客户
	 */
	@Override
	public Customer getById(long l) {

		return this.getHibernateTemplate().get(Customer.class, l);
	}

	/**
	 * 查找所有客户
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAll() {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

	/**
	 * 离线条件查询
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllByQBC() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class); 
		return (List<Customer>) this.getHibernateTemplate().findByCriteria(criteria);
	}

}
