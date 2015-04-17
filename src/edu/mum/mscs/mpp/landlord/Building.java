package edu.mum.mscs.mpp.landlord;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private List<Apartment> apartments;
	private double maintainenacecost;
	
	public Building(double maintainenacecost) {
		super();
		this.apartments = new ArrayList<Apartment>();
		apartments.add(new Apartment(10000));
		apartments.add(new Apartment(20000));
		apartments.add(new Apartment(30000));
		
		this.maintainenacecost = maintainenacecost;
	}
	
	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}


	public void setMaintainenacecost(double maintainenacecost) {
		this.maintainenacecost = maintainenacecost;
	}
	public double getrent() {
		// TODO Auto-generated method stub
		double sum = 0.0;
		for (int i = 0; i < apartments.size(); i++) {
			sum = sum + apartments.get(i).getRent();
		}
		return sum;
	}
	
	public double getmaintenace(){
		return maintainenacecost;
		
	}


	
}