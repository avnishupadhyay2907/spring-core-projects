package com.rays.autowire.bycounstructor;

public class UserService {

	private UserDAOInt userDao;

	public UserService(UserDAOInt userDao) {
		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}
}