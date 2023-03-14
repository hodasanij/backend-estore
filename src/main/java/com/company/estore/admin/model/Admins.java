package com.company.estore.admin.model;

import java.sql.Date;

/**
 * Admins Model
 * @author hodasanij
 *
 */

public class Admins {
	
	//data properties for pojo class of admin model
	private int adminId;
	private String email;
	private String password;
	private String fullName;
	private int loginType;
	private Date addedOn;
	
	//default constructor
	public Admins() {
		super();
	}
	
	//parametarized constructor
	public Admins(int adminId, String email, String password, String fullName, int loginType, Date addedOn) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.loginType = loginType;
		this.addedOn = addedOn;
	}

	//getter and setter methods
			
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getLoginType() {
		return loginType;
	}

	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	
	//override toString method
	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", email=" + email + ", password=" + password + ", fullName=" + fullName
				+ ", loginType=" + loginType + ", addedOn=" + addedOn + "]";
	}
	
}
