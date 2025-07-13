package dev.lihindu.firstspring;

import dev.lihindu.firstspring.user.User;
import dev.lihindu.firstspring.user.UserHttpClient;
import dev.lihindu.firstspring.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class FirstspringApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstspringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);

	}
	@Bean
	UserHttpClient userHttpClient() {
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com/");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
	}

//	@Bean
//	CommandLineRunner runner(UserRestClient client) {
//		return args -> {
//			List<User> users = client.findAll();
////			System.out.println(users);
//
//			User user = client.findById(2);
//			System.out.println(user);
//		};
//	}

	@Bean
	CommandLineRunner runner(UserHttpClient client) {
		return args -> {
			List<User> users = client.findAll();
	//			System.out.println(users);

			User user = client.findById(2);
			System.out.println(user);
		};
	}
}
