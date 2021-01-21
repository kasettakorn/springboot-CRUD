package com.example.dev.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
public class Member {
	
	@Id
	String ID;
	String USERNAME;
	String DESCRIPTION;
	
	public Member() {
		
	}
	public Member(String iD, String uSERNAME, String dESCRIPTION) {
		ID = iD;
		USERNAME = uSERNAME;
		DESCRIPTION = dESCRIPTION;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	
	

}
