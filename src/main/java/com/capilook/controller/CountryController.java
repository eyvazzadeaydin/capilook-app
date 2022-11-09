package com.capilook.controller;

import com.capilook.entity.Country;
import com.capilook.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country-api/v1")
public class CountryController {

    @Autowired
    CountryServiceImpl service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Country>> getAll(){
        return ResponseEntity.ok(service.getAllCountries());
    }

    @GetMapping("/get-capital/{countryName}")
    public ResponseEntity<String> getCapitalCity(@PathVariable(value = "countryName") String countryName){
        return ResponseEntity.ok(service.getCapitalCity(countryName));
    }
    @GetMapping("/get-country/{cityName}")
    public ResponseEntity<String> getCountryName(@PathVariable String cityName){
        return ResponseEntity.ok(service.getCountry(cityName));
    }

}
