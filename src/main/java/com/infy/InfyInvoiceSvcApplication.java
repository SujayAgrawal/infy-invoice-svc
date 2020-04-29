package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**Sample Comment*/
@SpringBootApplication
public class InfyInvoiceSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyInvoiceSvcApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
