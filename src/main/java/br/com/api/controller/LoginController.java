package br.com.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.entity.LoginEntity;
import br.com.api.entity.UserEntity;
import br.com.api.repositories.LoginRepository;
import br.com.api.repositories.UserRepository;
import br.com.api.utils.Constants;

@RestController
@RequestMapping("/login")
public class LoginController implements Constants {

	@Autowired
	private LoginRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(path="/efetuarLogin", method=RequestMethod.POST, consumes=JSON, produces=JSON)
	public LoginEntity efetuarLogin(@RequestBody Map<String, String> user) {
		LoginEntity login = new LoginEntity();
		if (user != null && !user.isEmpty()) {
			UserEntity userEnttiy = userRepository.getUsuario(user.get("userName"));
			login.setUsuario(userEnttiy);
			repository.save(login);
		}
		
		login = repository.findOne(login.getIdLogin());
		login.setHoraLogin(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		return login;
	}
}
