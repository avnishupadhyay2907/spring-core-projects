package com.rays.autowire.bycounstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByCounstructor {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-counstructor.xml");

		UserService userService = (UserService) context.getBean("userService");

		userService.testAdd();

	}

}
