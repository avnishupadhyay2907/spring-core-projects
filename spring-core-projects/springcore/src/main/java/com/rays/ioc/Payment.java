package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	@Value(value = "500")
	double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double makePayment(double amt) {

		balance = balance - amt;

		return balance;
	}

	public double deposit(double amt) {

		balance = balance + amt;

		return balance;

	}

}
