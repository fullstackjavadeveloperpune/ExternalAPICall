package com.fullstack.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CountryService", url = "https://countries.dev/alpha/IN")
public interface ICountryService {

    @GetMapping
    public String getCountryInfo();
}
