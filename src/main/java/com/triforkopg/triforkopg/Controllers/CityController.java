package com.triforkopg.triforkopg.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triforkopg.triforkopg.Models.City;
import com.triforkopg.triforkopg.Repositories.Interfaces.ICityRepository;

@RestController
@RequestMapping("api/v1/cities")
public class CityController 
{
    private final ICityRepository _cityRepository;

    public CityController(ICityRepository cityRepository)
    {
        this._cityRepository = cityRepository;
    }

    @GetMapping("/get")
	public ResponseEntity<List<City>> getCities()
	{
        try
        {
            return ResponseEntity.ok(_cityRepository.findAll());
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

	// Bruges i 'addCity' - Lav evt. en DTO i sin egen klasse i stedet
	record NewCityRequest(String name, String country)
	{

	}

	@PostMapping("/add")
	public ResponseEntity<City> addCity(@RequestBody NewCityRequest request)
	{
        try
        {
            // Implementer evt. et repository lag?
            City city = new City();
		    city.setName(request.name());
		    city.setCountry(request.country());
		    City savedCity = _cityRepository.save(city);
            return ResponseEntity.ok(savedCity);
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}
}