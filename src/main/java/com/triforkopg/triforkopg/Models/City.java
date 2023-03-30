package com.triforkopg.triforkopg.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class City 
{
    @Id
    @SequenceGenerator(name = "city_id_sequence", sequenceName = "city_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_id_sequence")
    private Integer _id;
    private String _name;
    private String _country;

    public City()
    {

    }

    public City(Integer id, String name, String country)
    {
       this._id = id;
       this._name = name;
       this._country = country;
    }

    public Integer getId()
    {
        return _id;
    }

    // Id bliver genereret af databasen og skal derfor ikke kunne sættes
    // public void setId(Integer id)
    // {
    //     this._id = id;
    // }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        this._name = name;
    }

    public String getCountry()
    {
        return _country;
    }

    public void setCountry(String country)
    {
        this._country = country;
    }
}
