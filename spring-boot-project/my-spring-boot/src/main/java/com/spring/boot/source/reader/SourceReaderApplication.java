package com.spring.boot.source.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.spring.boot.source.reader")
@RestController
public class SourceReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceReaderApplication.class, args);
	}

	@Component
	public class User {
		private String name = "lucas";
		private Integer age = 18;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
	}

}
