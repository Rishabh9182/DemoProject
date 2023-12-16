package com.course_service.course.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_service.course.entity.Course;
import com.course_service.course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourse(Long courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	

}
