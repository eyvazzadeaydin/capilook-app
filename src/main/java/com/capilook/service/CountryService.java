package com.capilook.service;

import com.capilook.entity.Country;

import java.util.List;

public interface CountryService {

    public List<Country> getAllCountries();

    public String getCapitalCity(String countryName);
}
