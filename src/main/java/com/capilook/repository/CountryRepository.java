package com.capilook.repository;

import com.capilook.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {


    Country findByCountryName(String countryName);

}