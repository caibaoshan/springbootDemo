package com.business.usermodule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.business.mapper")
public class UsermoduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermoduleApplication.class, args);
	}
}
