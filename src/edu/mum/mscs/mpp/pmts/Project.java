package edu.mum.mscs.mpp.pmts;

import java.util.Date;

// 



public class Project {
	private int id;
	private String name;
	private ProjectManager projectManager;
	private String listOfReleases;
	private Date dueDate;
	private String Productbacklog;
	
	public ProjectManager getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}
	
	
	
}
