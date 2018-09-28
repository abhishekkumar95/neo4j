package com.stackroute.matchzone.indexer.model;


public class SkillsIndex {
	private String iTSkills;
	private String version;
	private String level;
	private String lastUsed;
    private String profileId;

	public String getiTSkills() {
		return iTSkills;
	}

	public void setiTSkills(String iTSkills) {
		this.iTSkills = iTSkills;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

}

