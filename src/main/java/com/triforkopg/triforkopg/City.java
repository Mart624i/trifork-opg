package com.triforkopg.triforkopg;

public class City 
{
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

    public void setId(Integer id)
    {
        this._id = id;
    }

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
