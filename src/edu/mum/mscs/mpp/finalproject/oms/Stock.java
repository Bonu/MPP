package edu.mum.mscs.mpp.finalproject.oms;

import java.util.HashMap;

public class Stock {

	HashMap<Integer, StockProduct> sp = new HashMap<Integer, StockProduct>();
	
	public Stock() {
		super();
		loadProductsToStock();
	}
	
	public void addStock(int productId, int quantity) {
		sp.put(productId, new StockProduct(productId, quantity));
	}
	
	public void modifyStock(int productId, int quantity) {
		
	}
	
	public HashMap<Integer, StockProduct> getStock(){
		return sp;
	}
	
	/** 
	 * load initial stock
	 */
	public void loadProductsToStock(){
		
		 addStock(101, 20);
		 addStock(102, 20);
		 addStock(103, 20);
		 addStock(104, 20);
		 addStock(105, 20);
		 addStock(106, 20);
		 addStock(107, 20);
		 addStock(108, 20);
		 addStock(109, 20);
		 addStock(110, 20);
		 
	}
	
}
