package com.tenpearls.contact_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	public org.springframework.boot.CommandLineRunner initUser(com.tenpearls.contact_manager.repository.UserRepository userRepository) {
		return args -> {
			com.tenpearls.contact_manager.entity.User user = new com.tenpearls.contact_manager.entity.User();
			user.setName("Admin");
			// Email mein waqt isliye daala taake 'Email already exists' ka error na aaye
			user.setEmail("admin" + System.currentTimeMillis() + "@test.com");
			user.setPassword("password123");
			user.setRole("USER");

			user = userRepository.save(user);
			System.out.println("==========================================================");
			System.out.println("NAYA USER BAN GAYA HAI! ISKI ASLI ID HAI: " + user.getId());
			System.out.println("==========================================================");
		};
	}
}