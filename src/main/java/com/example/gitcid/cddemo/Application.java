package com.example.gitcid.cddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/welcome")
	public String welcome(){
		return "welcome to my code";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
