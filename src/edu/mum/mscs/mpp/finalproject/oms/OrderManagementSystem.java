/**
 * 
 */
package edu.mum.mscs.mpp.finalproject.oms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author janardhanbonu
 *
 */
public class OrderManagementSystem {

	// TODO Convert the stock to List of Stock Products
	HashMap<Integer, Product> products;
	// private Stock stock;
	
	public OrderManagementSystem(){
		System.out.println("----------Constructor => OrderManagementSystem-------------------");
		loadInitialData();
	}
	
	public static void main(String[] args) {
		System.out.println("----------------Welcome to Order Tracking System-----------------");
		OrderManagementSystem orderManagementSystem = new OrderManagementSystem();
		
		// Case 1
		ACustomer customer = orderManagementSystem.createNewCorporateCustomer();
		Order order = orderManagementSystem.createOrder(10001, customer.id,
				101, 10);
		customer.addNewOrder(order);
		customer.confirmOrder(order);
		customer.postOrderUpdate(order);
		
//		updateStock(order);

	}
	
	public void updateStock(Order order) {
		
	}

	/** New Products in stock - init */
	public void loadInitialData() {
		// stock = new Stock();
		System.out.println("------Method => OrderManagementSystem.loadInitialData-----------");
		products = loadProductsInformation();
	}

	// New customer
	public ACustomer createNewCorporateCustomer() {
		System.out.println("-----Method => OrderManagementSystem.createNewCorporateCustomer----");
		ACustomer customer = new CorporateCustomer(100001, "STEVE JOHN", 2000,
				"GOOD");
		return customer;
	}

	public ACustomer createNewPersonalCustomer() {
		System.out.println("-----Method => OrderManagementSystem.createNewPersonalCustomer----");
		ACustomer customer = new PersonalCustomer(200001, "STEVE JOHN");
		return customer;
	}

	public Order createOrder(int orderId, int customerId, int productId,
			int numberOfProducts) {
		System.out.println("-----Method => OrderManagementSystem.createOrder---------");
		Order order = Order.createNewOrder(orderId, customerId);
		order.addProductToOrder(products.get(productId), numberOfProducts);
		return order;
	}

	private HashMap<Integer, Product> loadProductsInformation() {
		HashMap<Integer, Product> products = new HashMap<Integer, Product>();

		products.put(101, new Product(101, "HP_SPROUT", "HP_SPROUNT COMPUTER",
				1800, "CP"));
		products.put(102, new Product(102, "GE_BPCHECK",
				"GE BLOOD PRESSURE CHECK", 500, "HP"));
		products.put(103, new Product(103, "HARMAN_A630",
				"HARMAN KARDON HOME SYSTEM", 3800, "AVP"));
		products.put(104,
				new Product(104, "TABLE", "COMPUTER TABLE", 200, "OP"));
		products.put(105, new Product(105, "MACBOOK", "APPLE MAC BOOK 2015",
				2800, "CP"));
		products.put(106, new Product(106, "GE_DIACHECH", "GE DIABETIC CHECK",
				800, "HP"));
		products.put(107, new Product(107, "YAMAHA_T800", "YAMAHA HOME SYSTEM",
				6800, "AVP"));
		products.put(108, new Product(108, "PRINTER", "HP LASER PRINTER ",
				1000, "OP"));
		products.put(109, new Product(109, "INK_CATRIDGE",
				"HP PRINTER CATRIDGE", 100, "OP"));
		products.put(110, new Product(110, "PEN_DRIVE",
				"SAN DISK USB 3.0 128GB ", 60, "OP"));

		return products;
	}

}
