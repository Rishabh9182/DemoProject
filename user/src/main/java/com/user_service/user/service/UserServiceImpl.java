package com.user_service.user.service;
 import java.util.ArrayList;
/** this is the service class
 * this is use to implement user service interface
 * in this we write all the building logic of our application
 */
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;
import com.user_service.user.entity.User;
import com.user_service.user.entity.UserEnroll;
import com.user_service.user.objects.CourseDto;
import com.user_service.user.objects.UserDto;
import com.user_service.user.repository.UserEnrollRepository;
import com.user_service.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	UserEnrollRepository userEnrollRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * this method is use to retrieve all users
     * 
     * 
     */
	
	@Override
	public List<User> getAllUser() {
		logger.debug("Getting all users");
	
		try{
			return userRepository.findAll();
		}
		catch (Exception e) {
			throw new RuntimeException("Failed to get all users", e);
		}
	}
	
	/**
	 * this method use user id to retrieve the user
	 * 
	 */
	
    @Override
	public User getUser(Long userId) {
		logger.debug("Get user: {}", userId );
		try{
			return userRepository.findById(userId).get();
		}
		catch (Exception e) {
			throw new RuntimeException("Failed to get user with ID" + userId, e);
		}
	}
    
     /**
      * this method is use to add the new user
     */
    
	@Override
	public User addUser(User user) {
		logger.debug("Adding new user: {}", user);
		try{
			return userRepository.save(user);
		}
		catch (Exception e) {
			throw new RuntimeException("Failed to add new user", e);
		}
	}

	/**
	 * this method is use to update the existing user
	 *
	 */
	
	@Override
	public User updateUser(User user) {
		logger.debug("Adding new user: {}", user); 
	        return userRepository.save(user);
	}

//	@Override
//	public UserEnroll getUserByCourseId(Long courseId) {
//		logger.debug("Get user: {}", courseId);
//
//	try {
//		return userEnrollRepository.findUserByCourseId(courseId);
//	}
//	catch (Exception e) {
//		// TODO: handle exception
//		throw new RuntimeException("get user by courseId" + courseId, e);
//	}
//	}

	@Override
	public List<UserEnroll> getAllUserEnroll() {
		// TODO Auto-generated method stub
		return userEnrollRepository.findAll();
	}

	@Override
	public UserEnroll addUserEnroll(UserEnroll userEnroll) {
		
		return userEnrollRepository.save(userEnroll);
	}
	
	@Override
	public List<UserDto> getUserByCourseId(Long courseId) {
		 List<UserEnroll> userEnrolls = userEnrollRepository.findByCourseId(courseId);
	        List<UserDto> userDtos = new ArrayList<>();
	        for (UserEnroll userEnroll : userEnrolls) {
	            User user = userRepository.findById(userEnroll.getUser().getUserId()).orElse(null);
	            if (user != null) {
	            	CourseDto courseDto = courseService.getCourseById(userEnroll.getCourseId());
	                UserDto userDto = new UserDto(user.getUserId(), user.getName(), user.getEmail(), user.getAddress(), user.getPhoneNo(), user.getAge(), courseDto);
	                userDtos.add(userDto);
	            }
	        }
	        return userDtos;
	    }
}
