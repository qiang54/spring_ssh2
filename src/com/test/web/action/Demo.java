package com.test.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.Customer;
import com.test.service.CustomerService;

/**
 * 测试
 * @author qiang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

	@Resource(name="customerService")
	private CustomerService customerService;
	/**
	 * 更新
	 */
	@Test
	 public void Run() {
		Customer customer = new Customer();
		customer.setCust_id(1L);
		customer.setCust_name("测试");
		
		 customerService.update(customer);
	 }
	
	/**
	 * 查询某一个客户
	 */
	@Test
	 public void Run1() {
		Customer customer = customerService.getById(1L);
		System.out.println(customer);
		
	 }
	/**
	 * 查询所有客户
	 */
	@Test
	 public void Run2() {
		List<Customer> customer = customerService.findAll();
		System.out.println(customer);
		
	 }
	/**
	 * 离线条件查询
	 */
	@Test
	 public void Run3() {
		List<Customer> customer = customerService.findAllByQBC();
		System.out.println(customer);
		
	 }
}
