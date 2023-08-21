package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public Student student() {
		Student s = new Student();
		s.name= "satyam";
		return s;
		
	} 
	
	

}
