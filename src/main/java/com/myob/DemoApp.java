package com.myob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.myob"} )
public class DemoApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);

	}
}
