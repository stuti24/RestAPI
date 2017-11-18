package com.cbx.userdetails;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
public class UserDetails {
	
	@Id
	private String id;
	private String fName;
	private String lName;
	private String emailId;
	private int pinCode ;
	@JsonDeserialize
	private String birthDate;
	private boolean isActive;
	
	public UserDetails() {
	}
	
	public UserDetails(String id, String fName, String lName, String emailId, int pinCode, String birthDate,
			boolean isActive) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.pinCode = pinCode;
		this.birthDate = birthDate;
		this.isActive = isActive;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
