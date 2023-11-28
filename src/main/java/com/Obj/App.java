package com.Obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emconfig.xml");
		EmployeeBean emp = (EmployeeBean) ctx.getBean("empbean");
		System.out.println(emp);
	}
}
