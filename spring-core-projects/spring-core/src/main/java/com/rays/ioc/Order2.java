package com.rays.ioc;

public class Order2 {

	private Payment payment;
	private Inventory inventory;

	public Order2(Payment payment, Inventory inventory) {
		this.payment = payment;
		this.inventory = inventory;

	}

	public void bookATicket(int items) {

		int price = 50;

		double totalAmount = items * price;

		double updatedBalance = payment.makePayment(totalAmount);

		int updatedStock = inventory.sold(items);

		System.out.println("Tickets are Booked");

		System.out.println("Total Amount Paid: " + totalAmount);

		System.out.println("Remaining Balance: " + updatedBalance);

		System.out.println("Updated Stock: " + updatedStock);
	}
}
