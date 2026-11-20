package com.fullstack.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CountryService {

   // private final RestTemplate restTemplate;

    private final ICountryService countryService;

    String url = "https://countries.dev/alpha/IN";

    public String getCountryInfo() {

        return countryService.getCountryInfo();

    }
}
