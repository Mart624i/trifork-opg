package com.triforkopg.triforkopg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriforkOpgApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(TriforkOpgApplication.class, args);
		
	}
}

// docker exec -it postgres bash - connect til docker containeren i den egen terminal
// psql -U mart624i - tilgå postresql databasen som mart624i
// \l - se liste over databaser
// \c city - connect til city
