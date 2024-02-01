package com.ysp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysp.Entity.User;
import com.ysp.Entity.UserData;
import com.ysp.repositeries.UserRepository;

@RestController
public class UserController {
		
	@Autowired
	private UserRepository userRepository;
	
	public void addUser() {
		User user = new User();
		user.setFirstName("Yogesh");
		user.setLastName("Patil");
		user.setEmail("yogesh@gmail.com");
		user.setPassword("Yogesh88");
		user.setPhone(8408039572l);
		user.setDate(LocalDate.of(2023, 11, 13));
		user.setHouseNo("121");
		user.setStreet("ShivNagar");
		user.setCity("Udgir");
		user.setState("MH");
		user.setPinCode(413532);
		user.setRole("Computer Repair");
		userRepository.save(user);
	}
	
	@GetMapping("/all-users")
	public UserData getUsers() {
		UserData userData = new UserData();
		List<User> ulist = (List<User>) userRepository.findAll();
		userData.setUserdata(ulist);
		return userData;
	}
}
