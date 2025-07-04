package com.rays.scope.singelton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonScope {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");

		UserService s = (UserService) context.getBean("userService");
		UserService s1 = (UserService) context.getBean("userService");

		System.out.println(s == s1);

	}

}
