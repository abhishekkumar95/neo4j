package com.stackroute.matchzone.indexer.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ProjectNode {
	@Id
	private Long id;
	private String projectName;
	private String projectDuration;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	public ProjectNode(Long id, String projectName, String projectDuration) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
	}
	
	

}
