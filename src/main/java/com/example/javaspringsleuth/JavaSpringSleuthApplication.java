package com.example.javaspringsleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JavaSpringSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringSleuthApplication.class, args);
	}

}
