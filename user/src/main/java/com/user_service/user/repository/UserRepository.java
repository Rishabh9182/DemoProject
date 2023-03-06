package com.user_service.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_service.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

	
	

}
