package com.stackroute.matchzone.indexer.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.indexer.node.AcademicNode;
import com.stackroute.matchzone.indexer.node.UserNode;

@RelationshipEntity(type="HOLDS")
public class Holds {
	
	private String name;
	@StartNode
	UserNode user;
	@EndNode
	AcademicNode academicNode;
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
	public AcademicNode getAcademicNode() {
		return academicNode;
	}
	public void setAcademicNode(AcademicNode academicNode) {
		this.academicNode = academicNode;
	}
	public Holds() {
		super();
	}
	
	

}
