package edu.mum.mscs.mpp.finalproject.oms;

public class PersonalCustomer extends ACustomer {
	
	public boolean prepaid = true;
	public String creditRating; 
	public String creditCard;
	
	// Assumption: The credit rating for personal customer is always poor. 
	// Bill contains totol amount customer has to pay for the purchase items in last month
	
	public PersonalCustomer(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public void getRating(String rating) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateCustomerDetails(Order order) {
		String status=order.status;
		if(status.equals("NEW_ORDER")) {
			
		} else if(status.equals("PARTIAL_ORDER")) {
			
		} else if(status.equals("COMPLETED_ORDER")) {
			
		}
		
		if(rating.equals("POOR")){
			prepaid = true;
		}
	}

	
}
