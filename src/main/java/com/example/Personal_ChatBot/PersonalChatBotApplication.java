package com.example.Personal_ChatBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PersonalChatBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalChatBotApplication.class, args);
	}

}
