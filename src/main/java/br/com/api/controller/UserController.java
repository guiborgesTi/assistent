package br.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.entity.UserEntity;
import br.com.api.repositories.UserRepository;
import br.com.api.utils.Constants;


@RestController
@RequestMapping("/user")
public class UserController implements Constants {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	@RequestMapping(path="/insertUser",method=RequestMethod.POST, consumes=JSON)
	public void insertUser(@RequestBody UserEntity user) {
		userRepository.save(user);
	}
	
	@RequestMapping(path="/findUserById/{idUser}", method=RequestMethod.GET)
	public UserEntity findById(@PathVariable Long idUser) {
		UserEntity user = userRepository.findOne(idUser);
		return user;  
	}
	
	
	
}