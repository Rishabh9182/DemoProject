package com.course_service.course.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private Long id;
	private String title;
	private String description;
	private Integer price;
	private String difficulty;
	private String language;
	private String status;
	//private Long userId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
   
	public Course() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", difficulty=" + difficulty + ", language=" + language + ", status=" + status + "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
