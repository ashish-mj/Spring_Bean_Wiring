package com.rakuten.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService service=(ProductService) ctx.getBean("service");
		System.out.println(service.getProducts());
	}
}
