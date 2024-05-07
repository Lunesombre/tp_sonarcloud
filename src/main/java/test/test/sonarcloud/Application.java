package test.test.sonarcloud;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		LoggerFactory.getLogger(Application.class).info("Ceci est la branche de test, YOLO");
	}

}
