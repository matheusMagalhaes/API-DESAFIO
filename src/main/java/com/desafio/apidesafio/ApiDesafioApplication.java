package com.desafio.apidesafio;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@SpringBootApplication
public class ApiDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDesafioApplication.class, args);
		
	}
	
	@Configuration
	public class AppConfiguration {
	    @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
	} 

}
