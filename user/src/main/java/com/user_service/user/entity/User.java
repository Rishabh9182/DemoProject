package com.user_service.user.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private Long userId;
	private String name;
	private String email;
	private String address;
	private String phoneNo;
	private Integer age;
	@OneToOne(cascade = CascadeType.ALL)
	private UserEnroll userEnroll;
	
	
	
	public User(Long userId, String name, String email, String address, String phoneNo, Integer age,
			UserEnroll userEnroll) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
		this.age = age;
		this.userEnroll = userEnroll;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public UserEnroll getUserEnroll() {
		return userEnroll;
	}

	public void setUserEnroll(UserEnroll userEnroll) {
		this.userEnroll = userEnroll;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneNo="
				+ phoneNo + ", age=" + age + "]";
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}