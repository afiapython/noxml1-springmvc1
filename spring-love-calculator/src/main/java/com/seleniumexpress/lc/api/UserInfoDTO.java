package com.seleniumexpress.lc.api;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "* your name cannot be blank")
	@Size(min = 3,max = 15,message = "* your name should have atleast 3 to 15 characters")
	private String userName;
	
	@NotBlank(message = "* Crush name cannot be blank")
	@Size(min = 3,max = 15,message = "* Crush name should have atleast 3 to 15 characters")
	private String crushName;
	
	@AssertTrue(message = "agree to use our app")
	private boolean termAndCondition;
	
	public UserInfoDTO() {
		System.out.println("user info dto contr called..");
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	

}
