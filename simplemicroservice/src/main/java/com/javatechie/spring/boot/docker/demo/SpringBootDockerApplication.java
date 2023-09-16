package com.javatechie.spring.boot.docker.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/")
	public String getIntroduction() {
		return "Bienvenido a mi microservicio!..";
	}

	@GetMapping("/message1")
	public String getMessage1() {
		return "Hola Mundo!";
	}

	@GetMapping("/message2")
	public String getMessage2() {
		return "Hola Valle Grande!";
	}

	@GetMapping("/message3")
	public ResponseEntity<Map<String, Object>> getMessage3() {
		Map<String, Object> jsonResponse = new HashMap<>();

		jsonResponse.put("message", "Hola desde getMessage3");
		jsonResponse.put("author", "Pedro Porras Luyo");

		List<String> tags = Arrays.asList("Spring", "Java", "API");
		jsonResponse.put("tags", tags);

		return ResponseEntity.ok(jsonResponse);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
