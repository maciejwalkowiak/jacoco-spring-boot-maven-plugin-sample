package com.example.jacocospringbootmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class JacocoSpringBootMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacocoSpringBootMavenApplication.class, args);
	}
}

@RestController
class HelloController {

	@GetMapping("/hello")
	Map<String, String> hello(@RequestParam(required = false) String foo) {
		if ("foo".equals(foo)) {
			System.out.println("this is not going to happen");
		}
		return Map.of("foo", "bar");
	}

}
