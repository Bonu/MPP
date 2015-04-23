package edu.mum.mscs.mpp.finalproject.oms;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Customer can place one order for a number of products
 * and customer can place multiple orders
 * 
 * @author janardhanbonu
 */
public abstract class ACustomer implements ICustomer {
	
	public int id;
	public String name;
	public float balanceAmount;
	public List<Order> orders = new ArrayList<Order>();
	public float points;
	public boolean isDiscountEligible = false;
	public short discountPercentNextOrder = 40;
	boolean prepaid = false;
	public String rating="POOR";
	
	/** ---Actions----- */
	public void addNewOrder(Order order){
		System.out.println("-----Method => ACustomer.addNewOrder-------");
		orders.add(order);
		updateCustomerDetails(order);
	}
	
	public void postOrderUpdate(Order order){
		System.out.println("-----Method => ACustomer.postOrderUpdate-------");
		
		points = order.orderPoints;
		if(points >= 25){
			isDiscountEligible = true;
			points = 0;  // our company policy to reset points to zero
		}
	}
	
	public abstract void updateCustomerDetails(Order order);
	
	public void generateMonthlyBill(){
		
	}
	
	public void payByCreditCard(){
		
	}
	
	public void confirmOrder(Order order) {
		System.out.println("-----Method => ACustomer.confirmOrder-------");
		
		if(prepaid){
			payByCreditCard();
		}else{
			generateMonthlyBill();
		}
		updateShippingDate(order);
	}
	
	
	public void updateShippingDate(Order order){
		System.out.println("-----Method => ACustomer.updateShippingDate-------");
		
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DAY_OF_MONTH, 4);
		order.updateShippingDate(calendar.getTime());
	}
	
}
