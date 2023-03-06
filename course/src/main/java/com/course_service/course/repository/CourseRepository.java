package com.course_service.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.course_service.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	



}
