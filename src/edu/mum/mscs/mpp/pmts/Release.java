package edu.mum.mscs.mpp.pmts;

import java.util.ArrayList;
import java.util.List;

// 


public class Release {
	private String version;
	private List<Feature> subsetOfBacklogs;
	private List<Sprint> listOfSprint;
	private String dueDate;
	private Project prj;
	
	public void setSubsetOfBacklogs(List<Feature> subsetOfBacklogs) {
		this.subsetOfBacklogs = subsetOfBacklogs;
		listOfSprint = new ArrayList<Sprint>();
		Sprint s1 = new Sprint(getSubset1());
		listOfSprint.add(s1);
		Sprint s2 = new Sprint(getSubset2());
		listOfSprint.add(s1);
		
	}
	
	
	public List<Feature> getSubset1(){
		List<Feature>  subset1 = new ArrayList<Feature>();
		for (int i = 0; i < subsetOfBacklogs.size() - 4; i++) {
			subset1.add(subsetOfBacklogs.get(i));
		}
		return subset1;
	}
	
	public List<Feature> getSubset2(){
		List<Feature>  subset2 = new ArrayList<Feature>();
		for (int i = 4; i < subsetOfBacklogs.size(); i++) {
			subset2.add(subsetOfBacklogs.get(i));
		}
		return subset2;
	}
	
}
