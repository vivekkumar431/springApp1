package com.Sett.Cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emconfig.xml");
	      Product p=(Product)ctx.getBean("prod");
	      System.out.println(p);
	}
}
