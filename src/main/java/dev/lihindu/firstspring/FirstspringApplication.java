package dev.lihindu.firstspring;

import dev.lihindu.firstspring.run.Location;
import dev.lihindu.firstspring.run.Run;
import dev.lihindu.firstspring.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class FirstspringApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstspringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(RunRepository runRepository) {
		return  args -> {
			Run run = new Run(1, "First Run" , LocalDateTime.now() , LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5 , Location.OUTDOOR);
			runRepository.create(run);
		};
	}

}
