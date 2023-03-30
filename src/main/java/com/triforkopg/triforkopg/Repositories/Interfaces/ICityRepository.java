package com.triforkopg.triforkopg.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triforkopg.triforkopg.Models.City;

public interface ICityRepository extends JpaRepository<City, Integer>
{
    
}