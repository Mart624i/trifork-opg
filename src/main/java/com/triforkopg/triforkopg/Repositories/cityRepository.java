package com.triforkopg.triforkopg.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triforkopg.triforkopg.Models.City;

public interface cityRepository extends JpaRepository<City, Integer>
{
    
}