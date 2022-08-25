package com.squadtripulantes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TripulantessoftApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TripulantessoftApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo Squad Tripulantes ");
	}
}
