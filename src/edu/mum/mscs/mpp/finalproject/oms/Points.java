package edu.mum.mscs.mpp.finalproject.oms;

public class Points {

	// TODO: Refactoring - Should convert this method to polymorphism
	public static float getPoints(String productType){
		float points = 0;
		if(productType.equals("CP")){
			points =  2;
		} else if(productType.equals("HP")){
			points =  1;
		} else if(productType.equals("AVP")){
			points =  0.50f;
		} else if(productType.equals("OP")){
			points =  1.25f;
		} 
		return points;
	}
}
