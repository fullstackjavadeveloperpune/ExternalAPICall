package com.fullstack.controller;

import com.fullstack.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor

public class CountryController {

    private final CountryService countryService;

    @GetMapping("/country-info")
    public ResponseEntity<String> getCountryInfo() {

        return new ResponseEntity<>(countryService.getCountryInfo(), HttpStatus.OK);
    }
}
