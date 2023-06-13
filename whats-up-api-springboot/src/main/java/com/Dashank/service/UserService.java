package com.Dashank.service;

import java.util.List;

import com.Dashank.exception.UserException;
import com.Dashank.model.User;
import com.Dashank.request.UpdateUserRequest;

public interface UserService {
	
	public User findUserProfile(String jwt);
	
	public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public List<User> searchUser(String query);
}
