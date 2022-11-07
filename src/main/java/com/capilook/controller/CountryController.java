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

    @GetMapping("get/{country-name}")
    public ResponseEntity<String> getCapitalCity(@PathVariable(value = "country-name") String countryName){
        return ResponseEntity.ok(service.getCapitalCity(countryName));
    }

}
