package edu.mum.mscs.mpp.landlord;

import java.util.ArrayList;
import java.util.List;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FamilyHome> familyhome = new ArrayList<FamilyHome>();
		familyhome.add(new FamilyHome(5000));
		familyhome.add(new FamilyHome(6000));
		
		List<Building> building = new ArrayList<Building>();
		building.add(new Building(600));
		building.add(new Building(500));
		
		List<WareHouse> warehouse = new ArrayList<WareHouse>();
		warehouse.add(new WareHouse(600));
		warehouse.add(new WareHouse(500));
		
		List<Farmland> farmland = new ArrayList<Farmland>();
		farmland.add(new Farmland(600));
		farmland.add(new Farmland(500));
		
		RentalManager rental = new RentalManager(familyhome, building, warehouse, farmland);
		
		LandLord landlord = new LandLord(rental);
		
		}

}
