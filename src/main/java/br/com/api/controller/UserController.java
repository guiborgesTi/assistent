package br.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.entity.User;
import br.com.api.utils.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	@RequestMapping("/insertUser")
	public void insertUser(@RequestParam User user) {
		userRepository.save(user);
	}
	
	
}
