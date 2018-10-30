package br.com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.com.api.entity")
public class AssistentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistentApplication.class, args);
	}
}
 