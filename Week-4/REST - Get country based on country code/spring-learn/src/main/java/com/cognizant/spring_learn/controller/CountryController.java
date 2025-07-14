package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countryService.getCountry(code);
        if (country == null) {
            throw new RuntimeException("Country not found with code: " + code);
        }
        return country;
    }
}
