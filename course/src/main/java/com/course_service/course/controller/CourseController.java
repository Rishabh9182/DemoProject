package com.course_service.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_service.course.entity.Course;
import com.course_service.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/{courseId}")
	public Course getCourse(@PathVariable Long courseId) {
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
//	@GetMapping("/{userId}")
//	public Course getCourseByUserId(@PathVariable Long userId) {
//		return courseService.getCourseByUserId(userId);
	//}
	
	
	 

	
}
