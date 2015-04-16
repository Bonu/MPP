package edu.mum.mscs.mpp.pmts;

// 



public class ProjectManager {
	private String name;
	private int id;
	private String type;
	private String releaseStatus="NO_STATUS";
	private String SprintStatus="NO_STATUS";
	private String BacklogStatus="NO_STATUS";
	
	public ProjectManager(int id, String name){
		this.id = id;
		this.name = name;
	}
	
}
