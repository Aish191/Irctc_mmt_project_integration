package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	RestTemplate restTempalate()
	{
		RestTemplate restTemplate= new RestTemplate();
		return restTemplate;
	}
}
