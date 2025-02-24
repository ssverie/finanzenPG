package de.svje.finanzen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanzenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanzenApplication.class, args);
		
		System.out.println("FinanzenApplication");
	}

}
