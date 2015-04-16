package edu.mum.mscs.mpp.pmts;

import java.util.ArrayList;
import java.util.List;

// 



public class PMTSystem {
	private List projects;
	
	
	public PMTSystem(){
		// Create empty project list.
		projects  = new ArrayList<Project>();
	}
	
	public void createProjectSetup(){
		Project prj = new Project();
		// We set project later assumption is a project can be create without project manager.
		prj.setProjectManager(new ProjectManager(20001, "PROJECT_MANAGER_1"));

//		prj.setProductBackLog(); we don't use set because it is composition 
//		and pb should be created with features list.So constructor is used.
		ProductBacklog pb = new ProductBacklog(createFeatures());
		
		// Create release plan for existing backlogs
		List<Release>  releases = new ArrayList<Release>();
		Release r1 = new Release();
		r1.setSubsetOfBacklogs(pb.getSubset1()); // this will set 8 backlogs to the release 1
		
		Release r2 = new Release();
		r2.setSubsetOfBacklogs(pb.getSubset2()); // this will set 8 backlogs to the release 1
		
		releases.add(r1);
		releases.add(r2);
		
		
	}
	
	
	private List<Feature> createFeatures(){
		
		List<Feature> features = new ArrayList<Feature>();
		
		Feature f1 = new Feature(10001,"FEATURE_1");
		Feature f2 = new Feature(10001,"FEATURE_2");
		Feature f3 = new Feature(10001,"FEATURE_3");
		Feature f4 = new Feature(10001,"FEATURE_4");
		Feature f5 = new Feature(10001,"FEATURE_5");
		Feature f6 = new Feature(10001,"FEATURE_6");
		Feature f7 = new Feature(10001,"FEATURE_7");
		Feature f8 = new Feature(10001,"FEATURE_8");
		Feature f9 = new Feature(10001,"FEATURE_9");
		Feature f10 = new Feature(10001,"FEATURE_10");
		Feature f11 = new Feature(10001,"FEATURE_11");
		Feature f12 = new Feature(10001,"FEATURE_12");
		Feature f13 = new Feature(10001,"FEATURE_13");
		Feature f14 = new Feature(10001,"FEATURE_14");
		Feature f15 = new Feature(10001,"FEATURE_15");
		Feature f16 = new Feature(10001,"FEATURE_16");
		
		features.add(f1);features.add(f2);features.add(f3);features.add(f4);
		features.add(f5);features.add(f6);features.add(f7);features.add(f8);
		features.add(f9);features.add(f10);features.add(f11);features.add(f12);
		features.add(f13);features.add(f14);features.add(f15);features.add(f16);
		
		return features;
	}
	
}
