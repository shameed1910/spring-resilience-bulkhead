package com.example.resilience4j.springresilience4jbulkhead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringResilience4jBulkheadApplication {




	public static void main(String[] args) {
		SpringApplication.run(SpringResilience4jBulkheadApplication.class, args);
		int i=1;
		IntStream.range(i,10).parallel().forEach(t->{
			String response = new RestTemplate().getForObject("http://localhost:8080/order", String.class);

		});
	}

}
