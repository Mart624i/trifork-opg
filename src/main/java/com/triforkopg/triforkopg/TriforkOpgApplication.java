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

// Databasen er en Postgresql, som kører gennem Docker. Det gør den fordi jeg havde problemer med at få noget andet til at virke på min laptop. Så jeg håber at det her fungerer. 
// Tilgå databasen gennem Docker commandline:
// docker exec -it postgres bash - connect til docker containeren i den egen terminal
// psql -U mart624i - tilgå postresql databasen som mart624i
// \l - se liste over databaser
// \c city - connect til city
// \d og \dt se liste over table relationer
// select * from city; - se hvad der ligger i 'city'-table