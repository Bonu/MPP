package edu.mum.mscs.mpp.housing;

public class Apartment {
	public Apartment(){}
 public Apartment(double rent) {
		super();
		this.rent = rent;
	}

private double rent;

public double getRent() {
	return rent;
}

public void setRent(double rent) {
	this.rent = rent;
}
 

}
