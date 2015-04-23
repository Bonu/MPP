package edu.mum.mscs.mpp.finalproject.oms;

import java.util.Date;

public class Product {

	private int productId;
	private String name;
	private String description;
	private float price;
	/* Shipping will be confirmed only after the state of the product is in
	   stock and order is confirmed. */
	Date shippingDate; 
	String type = "OP";
	boolean inStock = false;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name
				+ ", description=" + description + ", price=" + price
				+ ", shippingDate=" + shippingDate + ", type=" + type
				+ ", inStock=" + inStock + ", points=" + points + "]";
	}

	public float points = 0.0f;

	// The product space is created in the store where this product will be
	// sold. by default this place holder
	// doesn't contain stock. After the product is created, manually set the
	// stock status.

	public Product() {

	}

	public Product(int productId, String name, String description, float price,
			String type) {
		super();
		
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.points = Points.getPoints(type);
	}

	public Product(int productId, String name, String description, float price,
			boolean inStocK, String type) {
		this(productId, name, description, price, type);
		this.inStock = inStocK;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}
	
	

}
