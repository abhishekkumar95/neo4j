package com.stackroute.matchzone.indexer.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.indexer.node.ProjectNode;
import com.stackroute.matchzone.indexer.node.UserNode;

@RelationshipEntity(type="CERTIFIED IN")
public class CertifiedIn {
	private String name;
	@StartNode
	UserNode user;
	@EndNode
	ProjectNode projectNodde;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	public ProjectNode getProjectNodde() {
		return projectNodde;
	}
	public void setProjectNodde(ProjectNode projectNodde) {
		this.projectNodde = projectNodde;
	}
	public CertifiedIn() {
		super();
	}
	
	

}
