package com.cognizant.awsbeanstalkexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class AwsBeanstalkExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkExampleApplication.class, args);
	}
	@GetMapping("/")
	public String welcome() {
		return "Welcome to AWS Elastic Beanstalk";
	}
	@GetMapping("/hello/{name}")
	public String welcome(@PathVariable String name) {
		return "Hi "+name +" Welcome to AWS Elastic Beanstalk Deployment";
	}
	

}
