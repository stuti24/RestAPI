package com.cbx.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public UserDetails getUser(String UserId){
		return userDetailsRepository.findOne(UserId);
	}
	public void createUser(UserDetails userDetails){
		userDetailsRepository.save(userDetails);
	}
	
	public void updateUser(String UserId,UserDetails userDetails){
		userDetailsRepository.save(userDetails);
	}
	
	public void deleteUser(String UserId){
		userDetailsRepository.delete(UserId);
	}

}
