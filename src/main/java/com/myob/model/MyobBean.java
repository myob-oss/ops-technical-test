package com.myob.model;

import java.time.LocalDateTime;
import java.util.Properties;

import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MyobBean {

	@Bean
	public BuildProperties buildProperties() {
		Properties properties = new Properties();
		properties.put("group", "com.example");
		properties.put("artifact", "demo");
		properties.put("name", "MYOB");
		properties.put("time", getDate());
		properties.put("version", "0.0.1");
		return new BuildProperties(properties);
	}
	
	public String getDate() {
		String date = "";
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println("Current date : "+myObj+"");
		date=myObj+"";
		return date;
	}

}
