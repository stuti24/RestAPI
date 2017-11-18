package com.cbx.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@RequestMapping("st/get/{id}")
	public UserDetails getUser(@PathVariable String UserId){
		return userDetailsService.getUser(UserId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="st/create")
	public String createUser(@RequestBody UserDetails userDetails){
		 userDetailsService.createUser(userDetails);
		 return "Created the User";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="st/update/{id}")
	public String updateUser(@RequestBody UserDetails userDetails, @PathVariable String UserId){
		userDetailsService.updateUser(UserId,userDetails);
		return "Updated the User";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="st/delete/{id}")
	public String deleteUser(@PathVariable String UserId){
		userDetailsService.deleteUser(UserId);
		return "Deleted the User";
	}

}
