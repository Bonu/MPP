package edu.mum.mscs.mpp.pmts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 



public class Sprint {
	private String id;
	private List<Feature> noOfFeaturesPlanned;
	private List<Feature> noOfFeatuesCompleted;
	private List<Feature> pendingFeatures;
	private Date dueDate;
	
	public Sprint(List<Feature> noOfFeaturesPlanned){
		this.noOfFeaturesPlanned = noOfFeaturesPlanned;
	}
}
