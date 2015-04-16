package edu.mum.mscs.mpp.pmts;

import java.util.ArrayList;
import java.util.List;

// 



public class ProductBacklog {
	private List<Feature> listOfFeatures;
	
	public ProductBacklog(List<Feature> fs){
		listOfFeatures = fs;
	}

	public List<Feature> getListOfFeatures() {
		return listOfFeatures;
	}
	
	public List<Feature> getSubset1(){
		List<Feature>  subset1 = new ArrayList<Feature>();
		for (int i = 0; i < listOfFeatures.size() - 8; i++) {
			subset1.add(listOfFeatures.get(i));
		}
		return subset1;
	}
	
	public List<Feature> getSubset2(){
		List<Feature>  subset2 = new ArrayList<Feature>();
		for (int i = 8; i < listOfFeatures.size(); i++) {
			subset2.add(listOfFeatures.get(i));
		}
		return subset2;
	}
	
}
