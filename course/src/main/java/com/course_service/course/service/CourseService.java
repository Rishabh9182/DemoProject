package com.course_service.course.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.course_service.course.entity.Course;

@Component
public interface CourseService {
	
	List<Course> getAllCourses();
	Course getCourse(Long courseId);
	Course addCourse(Course course);
//	Course getCourseByUserId(Long userId);

}
