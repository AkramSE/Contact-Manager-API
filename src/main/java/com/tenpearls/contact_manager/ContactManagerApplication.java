package com.tenpearls.contact_manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagerApplication {

	// SonarQube ki requirement ke mutabiq Logger initialize kiya gaya hai
	private static final Logger logger = LoggerFactory.getLogger(ContactManagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	public org.springframework.boot.CommandLineRunner initUser(com.tenpearls.contact_manager.repository.UserRepository userRepository) {
		return args -> {
			com.tenpearls.contact_manager.entity.User user = new com.tenpearls.contact_manager.entity.User();
			user.setName("Admin");
			// Appending current timestamp to email to prevent 'Email already exists' constraint violation
			user.setEmail("admin" + System.currentTimeMillis() + "@test.com");
			user.setPassword("password123");
			user.setRole("USER");

			user = userRepository.save(user);

			// System.out.println ki jagah professional logger use kiya gaya hai
			logger.info("==========================================================");
			logger.info("NEW USER CREATED SUCCESSFULLY! GENERATED ID IS: {}", user.getId());
			logger.info("==========================================================");
		};
	}
}