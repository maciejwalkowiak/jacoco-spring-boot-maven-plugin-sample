package com.example.jacocospringbootmaven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

class JacocoSpringBootMavenApplicationIT {

	@Test
	void contextLoads() {
		var restTemplate = new RestTemplate();
		var result = restTemplate.getForObject("http://localhost:8080/hello", String.class);

		assertThat(result).isEqualTo("{\"foo\":\"bar\"}");
	}

}
