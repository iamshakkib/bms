package com.shakkib.mbs;

import com.shakkib.mbs.exceptions.StatusDetailsNotFoundException;
import com.shakkib.mbs.services.InitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Main class of the SpringBoot
 */
@SpringBootApplication
public class MbsApplication {

	/**
	 * Writing logs
	 * Initialize the logger
	 *
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(MbsApplication.class);

	public static void main(String[] args) throws StatusDetailsNotFoundException {

		SpringApplication.run(MbsApplication.class, args);



	}

	@Bean
	CommandLineRunner init(InitService initService){
		return args -> {
			System.out.println("This will be executed as soon as the application is started");
			initService.init();
		};
	}

}
