package edu.mum.mscs.mpp.finalproject.oms;

import java.util.List;

public class CorporateCustomer extends ACustomer{
	
	int creditLimit = 0;
	boolean prepaid = false;
	float monthlyBillAmount=0;
	
	public String credit_rating; //Assumption: Credit rating for corporate customer is GOOD
	
	public CorporateCustomer(int id, String name, int creditLimit, String rating){
		this.id = id;
		this.name = name;
		this.creditLimit = creditLimit;
		this.rating = rating;
	}
	
	public void generateMontlyBill(int month){
		
	}

	@Override
	public void getRating(String rating) {
		
	}
	
	@Override
	public void updateCustomerDetails(Order order) {
		String status=order.status;
		float totalPrice = 0;
		if(status.equals("NEW_ORDER")) {
			totalPrice = order.orderPrice;
			totalPrice = deductDiscoutAmount(totalPrice);
			if(totalPrice > creditLimit){
				prepaid = true;
			} else {
				prepaid = false;
				monthlyBillAmount += totalPrice;
			}
		} else if(status.equals("PARTIAL_ORDER")) {
			
		} else if(status.equals("COMPLETED_ORDER")) {
			
		}
		
		if(rating.equals("POOR")){
			prepaid = true;
		}
	}

	public float deductDiscoutAmount(float totalPrice){
		if(isDiscountEligible){
			float deductedAmount  = (40 * 100) / totalPrice;
			totalPrice = totalPrice - deductedAmount;
		}
		return totalPrice;
	}

}
