package com.user_service.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_service.user.entity.UserEnroll;

public interface UserEnrollRepository extends JpaRepository<UserEnroll, Long>{
	
	UserEnroll findUserByCourseId(Long courseId);


}
