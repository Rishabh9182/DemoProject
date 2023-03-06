package com.user_service.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.user_service.user.entity.User;
import com.user_service.user.entity.UserEnroll;
import com.user_service.user.objects.UserDto;

@Component
public interface UserService {

	List<User> getAllUser();

	User getUser(Long userId);

	User addUser(User user);

	User updateUser(User user);

//	List<User> getCourseByUserId(Long userId);
//	UserEnroll getUserByCourseId(Long courseId);

	List<UserEnroll> getAllUserEnroll();

	UserEnroll addUserEnroll(UserEnroll userEnroll);

//	CourseDto getCourseById(Long courseId);

//	List<User> getUserByCourse(Long courseId);


//	public  List<UserDto> getUsersByCourseId(Long courseId);

	List<UserDto> getUserByCourseId(Long courseId); 

	
	

}
