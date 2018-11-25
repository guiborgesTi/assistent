package br.com.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.api.enuns.LevelUsers;

@Entity
@Table(name = "user_assistent")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_usuario;
	
	@Column(name = "user_name", length = 20)
	@NotNull
	private String userName;
	
	@Column(name = "password", nullable = false)
	@NotNull
	private String password;
	
	@Column(name = "user_level", nullable = false, length = 1)
	@NotNull
	private Character userLevel;
	
}
