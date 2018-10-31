package com.zlx.test.PropertyPlaceholderConfigurer;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	
	@Autowired
	private BeanA beanA;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	private String sex;
	
	public void sayAll() {
		System.out.println(beanA.getName() + "," + beanA.getAge()+"," + sex);
	}
}
