package com.stackroute.matchzone.indexer.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CertificationNode {
	@Id
	private Long id;
	private String certificateName;
	private String certificateLicense;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getCertificateLicense() {
		return certificateLicense;
	}
	public void setCertificateLicense(String certificateLicense) {
		this.certificateLicense = certificateLicense;
	}
	public CertificationNode(Long id, String certificateName, String certificateLicense) {
		super();
		this.id = id;
		this.certificateName = certificateName;
		this.certificateLicense = certificateLicense;
	}
	

}
