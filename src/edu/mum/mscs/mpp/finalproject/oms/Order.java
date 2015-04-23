package edu.mum.mscs.mpp.finalproject.oms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Order life cycle has New Order,
 * Partial order, Completed Order status
 */
public class Order {

	public int id;
	public ACustomer customer;
	public int customerId;
	public float orderPrice;
	public float orderPoints;
	public String status = "NEW_ORDER"; 
	public List<OrderTracker> orderTrackers = null; // Order tracker has the product details

	private Order(int id, int customerId, String status) {
		super();
		orderTrackers = new ArrayList<OrderTracker>(); 
		System.out.println("-------Constructor => Order -------------");
		this.id = id;
		this.customerId = customerId;
		this.status = status;
	}

	public static Order createNewOrder(int id, int customerId) {
		System.out.println("-----Method => Order.createOrder---------");
		return new Order(id, customerId, "NEW_ORDER");
	}
	
	/** 
	 * Create order tracker for each product keep track of the products in order 
	 */
	public void addProductToOrder(Product product, int noOfProducts){
		System.out.println("-----Method => Order.addProductToOrder-------");
		OrderTracker orderTracker = new OrderTracker(product, noOfProducts);
		orderTrackers.add(orderTracker);
		// addOrderTrackerTotalPriceToOrderPrice
		orderPrice += orderTracker.totalPrice;
		orderPoints += orderTracker.points;
	}
	
	public void updateShippingDate(Date date){
		System.out.println("-----Method => Order.updateShippingDate-------");
		for (OrderTracker orderTracker : orderTrackers) {
			orderTracker.setShippingDate(date);
		}
	}
	
	
}
