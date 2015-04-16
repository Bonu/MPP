package edu.mum.mscs.mpp.pmts;

import java.util.Date;

// 



public class Feature {
	private int id;
	private String name;
	private String status="NO_START";
	private int developerId = 0;
	private int sprintId = 0;
	private int estimationInHours=0;
	private int completedinpercentage=0;
	private Date dueDate;
	public Feature(int id, String name, String status, int developerId,
			int sprintId, int estimationInHours,
			int completedinpercentage, Date dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.developerId = developerId;
		this.sprintId = sprintId;
		this.estimationInHours = estimationInHours;
		this.completedinpercentage = completedinpercentage;
		this.dueDate = dueDate;
	}
	
	public Feature(int id, String name){
		this( id,  name,  null,  0, 0,  0,0, null);
	}
	
	
}
