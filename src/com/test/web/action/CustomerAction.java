package com.test.web.action;



//import org.apache.struts2.ServletActionContext;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.domain.Customer;
import com.test.service.CustomerService;
/**
 * 客户控制层
 * 1.封装customer，模型驱动
 * 2.action调用service层，方法1.注入方式，提供私有属性和set方法
 * @author qiang
 *
 */
public class CustomerAction  extends ActionSupport implements ModelDriven<Customer>{

	private static final long serialVersionUID = 1L;
	//1.不要忘记new
	private Customer customer = new Customer();
	
	//2.调用
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Override
	public Customer getModel() {
		return customer;
	}
	/**
	 * 保存客户
	 * @return
	 */
	public String add() {
		
		System.out.println("web层：保存客户...");
		
		//1.工厂模式
//		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//		CustomerService cs = (CustomerService) context.getBean("customerService");
//		cs.save();
		
		//2.注入方式，私有属性，set方法，action由struts框架创建及管理
		//
		
		//3.注入方式，action由spring框架创建管理
		customerService.save(customer);
		return NONE;
	}
	
}
