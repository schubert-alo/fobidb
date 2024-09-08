package com.example.fobidb;

import com.example.fobidb.teacher.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FobidbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FobidbApplication.class, args);
	}
@GetMapping
	public List<Teacher> hello() {
		return List.of(
				new Teacher(
						1,
						"Schubert",
						"Simon",
						"sb",
						"simon.schubert@aloberlin.de",
						45
				)
		);
	}
}
