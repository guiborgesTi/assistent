package br.com.api.utils;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
