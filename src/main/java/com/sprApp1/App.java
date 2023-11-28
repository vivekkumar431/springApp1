package com.sprApp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("emconfig.xml");
         Student s=(Student) ctx.getBean("stud");
         s.printFormat();
	}
}
