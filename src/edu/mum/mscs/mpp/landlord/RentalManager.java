package edu.mum.mscs.mpp.landlord;

import java.util.List;

public class RentalManager {
	
	List<FamilyHome> familyhome;
	List<WareHouse> warehouse;
	List<Farmland> farmland;
	List<Building> building;
	
	public RentalManager(List<FamilyHome> familyhome,
			List<Building> building, List<WareHouse> warehouse,
			List<Farmland> farmland) {
		super();
		this.familyhome = familyhome;
		this.building = building;
		this.warehouse = warehouse;
		this.farmland = farmland;
	}

	public double getFamilyHomeRent(){
		double sum = 0.0;
		for(int i = 0 ; i<familyhome.size();i++)
			sum = sum + familyhome.get(i).getrent();
		return sum;
	}
	
	
	public double getBuildingRent(){
		double sum = 0.0;
		for(int i = 0 ; i<building.size();i++)
			sum = sum + building.get(i).getrent();
		return sum;
	}
	
	public double getWareHouseRent(){
		double sum = 0.0;
		for(int i = 0 ; i<warehouse.size();i++)
			sum = sum + warehouse.get(i).getrent();
		return sum;
	}
	
	public double getFarmLandRent(){
		double sum = 0.0;
		for(int i = 0 ; i<farmland.size();i++)
			sum = sum + farmland.get(i).getrent();
		return sum;
	}
	
	public double gettotalincome(){
		return getFamilyHomeRent()+getBuildingRent()+getWareHouseRent()+getFarmLandRent();
	}
 	
	public double getmaintenance(){
	double sum = 0.0;
	for(int i = 0 ; i<building.size();i++)
		sum = sum + building.get(i).getmaintenace();
	return sum;
	}
	
	public double getProfit(){
		return gettotalincome()-getmaintenance();
		}

}
