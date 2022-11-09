package com.capilook.service;

import com.capilook.entity.Country;
import com.capilook.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository repository;


    public List<Country> getAllCountries(){
        return repository.findAll();
    }

    @Override
    public String getCapitalCity(String countryName) {
        Country country = repository.findByCountryNameIgnoreCase(countryName);
        return null != country ? country.getCapitalCity() : "Invalid Country Name";
    }

    @Override
    public String getCountry(String cityName) {
        Country country = repository.findByCapitalCityIgnoreCase(cityName);
        return null != country ? country.getCountryName() : "Invalid Capital City Name";
    }


}
