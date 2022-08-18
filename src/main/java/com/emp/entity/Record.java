package com.emp.entity;

public class Record {
	
private Long cId;

private String companyName;

private String email;

private Long eId;

public Long getcId() {
	return cId;
}

public void setcId(Long cId) {
	this.cId = cId;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Long geteId() {
	return eId;
}

public void seteId(Long eId) {
	this.eId = eId;
}

public Record() {
	super();
}

public Record(Long cId, String companyName, String email, Long eId) {
	super();
	this.cId = cId;
	this.companyName = companyName;
	this.email = email;
	this.eId = eId;
}


	
}
