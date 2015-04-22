package edu.mum.mscs.mpp.finalproject.oms;

public class StockProduct {

	int productId;
	int quantity;
	
	public StockProduct(int productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
}
