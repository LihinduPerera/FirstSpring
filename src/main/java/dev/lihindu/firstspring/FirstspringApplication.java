package dev.lihindu.firstspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstspringApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstspringApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstspringApplication.class, args);
		log.info("Application Started Successfully !");

	}

}
