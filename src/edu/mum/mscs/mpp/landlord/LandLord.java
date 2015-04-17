package edu.mum.mscs.mpp.landlord;


public class LandLord {
	
	private RentalManager rentalmanager;

	
	public LandLord(RentalManager rentalmanager) {
		super();
		this.rentalmanager = rentalmanager;
		System.out.println("Total income is " + this.rentalmanager.gettotalincome());
		System.out.println("Total maintenance is "+ rentalmanager.getmaintenance());
		System.out.println("Total profit is "+ rentalmanager.getProfit());
	}

	
		
	
	
}
