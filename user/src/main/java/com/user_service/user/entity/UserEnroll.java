package com.user_service.user.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserEnroll {
	@Id
	private Long enrollId;
	private String duration;
	private String status;
	private String subscription;
	private Long courseId;
//	@OneToOne(fetch = FetchType.LAZY)
//	  @JoinColumn(name = "user_id")
//	private User user;
	
	public UserEnroll(Long enrollId, String duration, String status, String subscription, Long courseId) {
		this.enrollId = enrollId;
		this.duration = duration;
		this.status = status;
		this.subscription = subscription;
		this.courseId = courseId;
	}

	public Long getEnrollId() {
		return enrollId;
	}
	
	public void setEnrollId(Long enrollId) {
		this.enrollId = enrollId;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
	public UserEnroll() {
	
	}
	@Override
	public String toString() {
		return "UserEnroll [enrollId=" + enrollId + ", duration=" + duration + ", status=" + status + ", subscription="
				+ subscription + ", courseId=" + courseId + "]";
	}
	
	
	
	
	
	
	

}
