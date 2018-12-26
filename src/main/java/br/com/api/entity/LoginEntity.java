package br.com.api.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.Transient;

@Entity
@Table(name="login")
public class LoginEntity {

	@Id
	@GeneratedValue(generator="sequence_login")
	@SequenceGenerator(name="sequence_login", sequenceName="id_sequence_login")
	private Long idLogin; 
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usuario")
	private UserEntity usuario;
	
	@Column(name="hora_login")
	@Transient
	private String horaLogin;
	
	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

	public UserEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntity usuario) {
		this.usuario = usuario;
	}

	public String getHoraLogin() {
		return horaLogin;
	}

	public void setHoraLogin(String horaLogin) {
		this.horaLogin = horaLogin;
	}
}
