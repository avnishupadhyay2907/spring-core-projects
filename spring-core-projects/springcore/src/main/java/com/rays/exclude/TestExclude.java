package com.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExclude {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("exclude.xml");

	//	UserService userService = context.getBean(UserService.class);

		UserDAOHibImpl us =  (UserDAOHibImpl) context.getBean("userDAOHibImpl");

		us.add();;

	//	userService.testAdd();
	}
}
