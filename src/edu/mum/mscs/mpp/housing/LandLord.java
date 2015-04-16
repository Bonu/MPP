package edu.mum.mscs.mpp.housing;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	public LandLord(List<Building> building) {
		super();
		this.building = building;
	}
	public double totalbuildingrent(){
		double sum=0.0;
		for(int i=0;i<building.size();i++)
			sum = sum + building.get(i).getallrent();
		return sum;
	}
	public double totalmaintainance(){
		double maintanace = 0.0;
		for(int i=0;i<building.size();i++)
			maintanace = maintanace + building.get(i).getMaintainenacecost();
		return maintanace;
		
	}
	private List<Building>building;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Building> building = new ArrayList<Building>();
		building.add(new Building(1000));
		building.add(new Building(2000));
		LandLord landlord = new LandLord(building);
		
		System.out.println("Total rent is "+landlord.totalbuildingrent());
		System.out.println("Total maintaenance cost is  "+landlord.totalmaintainance());
		System.out.println("Total profit per month is "+(landlord.totalbuildingrent()-landlord.totalmaintainance()));
		
		 
	}

}
