package ca.mcgill.ecse321.eventregistration.EventRegistration;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@RestController
@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {

		SpringApplication.run(EventRegistrationApplication.class, args);
	}

	@RequestMapping("/")
	public String greeting(){
		return "Hello world!";
	}
}
