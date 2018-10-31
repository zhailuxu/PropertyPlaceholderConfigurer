package com.zlx.test.PropertyPlaceholderConfigurer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext rootApplicationContext = new ClassPathXmlApplicationContext(new String [] {"root-context.xml"},false);
		ClassPathXmlApplicationContext subApplicationContext = new ClassPathXmlApplicationContext(new String[] {"sub-context.xml"},false,rootApplicationContext);
		rootApplicationContext.refresh();
		subApplicationContext.refresh();
		BeanA beanA = subApplicationContext.getBean(BeanA.class);
		System.out.println(beanA.getName());
		
		BeanB beanB = subApplicationContext.getBean(BeanB.class);
		beanB.sayAll();
		
		//subApplicationContext.close();
	}
	
	
}
