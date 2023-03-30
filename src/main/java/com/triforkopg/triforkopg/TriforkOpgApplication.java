package com.triforkopg.triforkopg;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triforkopg.triforkopg.Models.City;
import com.triforkopg.triforkopg.Repositories.cityRepository;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/cities")
public class TriforkOpgApplication 
{
	private final cityRepository _cityRepository;

	public TriforkOpgApplication(cityRepository cityRepository)
	{
		this._cityRepository = cityRepository;
	}

	public static void main(String[] args) 
	{
		SpringApplication.run(TriforkOpgApplication.class, args);
		
	}

	@GetMapping("/get")
	public List<City> getCities()
	{
		return _cityRepository.findAll();
	}

	// Lav evt. en DTO i stedet
	record NewCityRequest(String name, String country)
	{

	}

	// Smid over i en controller og kald den fra repository med dependency injection
	@PostMapping("/add")
	public void addCity(@RequestBody NewCityRequest request)
	{
		City city = new City();
		city.setName(request.name());
		city.setName(request.country());
		_cityRepository.save(city);
	}
}

// docker exec -it postgres bash - connect til docker containeren i den egen terminal
// psql -U mart624i - tilgå postresql databasen som mart624i
// \l - se liste over databaser
// \c city - connect til city
