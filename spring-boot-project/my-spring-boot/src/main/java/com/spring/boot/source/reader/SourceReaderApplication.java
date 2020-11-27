package com.spring.boot.source.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.spring.boot.source.reader")
@RestController
public class SourceReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceReaderApplication.class, args);
	}

	public class User {
		private String name = "lucas";
		private Integer age = 18;
	}

}
