package edu.eci.arep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arep"})
public class APP {

	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}

}
