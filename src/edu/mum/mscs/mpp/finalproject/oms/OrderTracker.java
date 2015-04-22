package edu.mum.mscs.mpp.finalproject.oms;

// http://www.gridshore.nl/2009/04/06/the-power-of-immutability-in-a-rich-domain-model/

import java.util.Date;

/**
 * 
 * Order Tracker has to do may jobs such as
 * 1. set shipping date to products in the order
 * 2. check order value if the order value > creditlimit for corporate customer then
 * 		prepay by credit card
 * 3. if the customer type is personal then order must be prepaid by credit card
 * 4. Update customer points depending on the products point in the order.
 * 5. Depending on stock availability maintain order status as partial or complete order
 * 6. If the product is in stock, then change the status of product delivery date and
 * 		also the status of order from partial to complete.
 * 7. Generate monthly bill for the corporate customer.
 * 8. Update stock status after confirming product delivery date in order.
 * 
 * @author 984417
 *
 */
public class OrderTracker {
	
	Product product = new Product();
	int numberOfProducts = 0;
	float totalPrice = 0;
	float points = 0.00f;
	Date shippingDate = new Date();
	
	public OrderTracker(Product product, int numberOfProducts){
		this.product = product;
		this.numberOfProducts = numberOfProducts;
		this.totalPrice = product.getPrice() * numberOfProducts;
		this.points = product.points * numberOfProducts;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	

}
