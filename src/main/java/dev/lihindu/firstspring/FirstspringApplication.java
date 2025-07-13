package dev.lihindu.firstspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstspringApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstspringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);

	}

//	@Bean
//	CommandLineRunner runner(RunRepository runRepository) {
//		return  args -> {
//			Run run = new Run(1, "First Run" , LocalDateTime.now() , LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5 , Location.OUTDOOR);
//			runRepository.create(run);
//		};
//	}

}
