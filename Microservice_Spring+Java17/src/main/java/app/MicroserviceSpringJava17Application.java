package app;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroserviceSpringJava17Application {

	@GetMapping("/")
	public String getIntroduction() {
		return "Bienvenido a mi microservicio con Spring + Java 17!..";
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

		List<String> tags = Arrays.asList("Spring", "Java 17", "API");
		jsonResponse.put("tags", tags);

		return ResponseEntity.ok(jsonResponse);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSpringJava17Application.class, args);
	}

}
