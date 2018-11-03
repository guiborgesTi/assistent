package br.com.api.controller;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.entity.User;
import br.com.api.utils.Constants;
import br.com.api.utils.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController implements Constants {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(path="/insertUser", method=RequestMethod.POST, consumes=JSON)
	public void insertUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@RequestMapping(path="/findUserById/{idUser}")
	public User findById(@PathVariable Long idUser) {
		User user = userRepository.findOne(idUser);
		return user;  
	}
	
	
	
}