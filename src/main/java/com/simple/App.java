package com.simple;
//Spring APPlication 1 EXAMPLE
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emconfig.xml");
		EmployeeBean emp = (EmployeeBean) ctx.getBean("emp");
		System.out.println(emp);
	}
}
