package com.rays.ioc;

public class Order1 {

	private Payment payment;
	private Inventory inventory;

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void bookATicket(int items) {

		int price = 10;

		double totalAmount = items * price;

		double updatedBalance = payment.makePayment(totalAmount);

		int updatedStock = inventory.sold(items);

		System.out.println("Ticket are Booked");

		System.out.println("Toatal Amount Paid" + totalAmount);

		System.out.println("Remaining Balance: " + updatedBalance);

		System.out.println("Updated Stock: " + updatedStock);
	}

}
