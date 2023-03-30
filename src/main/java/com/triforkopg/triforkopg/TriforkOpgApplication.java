package com.triforkopg.triforkopg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TriforkOpgApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TriforkOpgApplication.class, args);
		String connectionUrl = ""
		
	}

	@GetMapping("/")
	public GreetResponse greet(){
		return new GreetResponse("Sup");
	}

	record GreetResponse(String greet){}

}
