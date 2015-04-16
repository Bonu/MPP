package edu.mum.mscs.mpp.housing;

import java.util.List;

public class Building {
public Building(List<Apartment> apartment, double maintainenacecost) {
		super();
		this.apartment = apartment;
		this.maintainenacecost = maintainenacecost;
	}
List<Apartment>apartment;
double maintainenacecost;
public List<Apartment> getApartment() {
	return apartment;
}
public void setApartment(List<Apartment> apartment) {
	this.apartment = apartment;
}
public double getMaintainenacecost() {
	return maintainenacecost;
}
public void setMaintainenacecost(double maintainenacecost) {
	this.maintainenacecost = maintainenacecost;
}
public double getallrent(){
double sum=0.0;	
for(int i=0;i<apartment.size();i++){
sum = sum+ apartment.get(i).getRent();
}
return sum;
}
}