package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbCustomprofilesApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(SbCustomprofilesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbCustomprofilesApplication.class, args);
	}

	@Value("${application.name}")
	private String applicationName;
	@Value("${username}")
	private String username;

	@Override
	public void run(String... arg0) throws Exception {
		log.info("Application name: {},Username:{}", applicationName, username);

	}
}
