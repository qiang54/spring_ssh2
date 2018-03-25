package com.test.web.action;

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
	
	@Test
	 public void Run() {
		Customer customer = new Customer();
		customer.setCust_id(1L);
		customer.setCust_name("测试");
		
		 customerService.update(customer);
	 }
}
