package com.example.project1.controllers;

import com.example.project1.dao.CountryResponse;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @GetMapping("/")
    private List<CountryResponse> getAll(){
        List<CountryResponse> countryResponseList = new ArrayList<>();
        String[] locales = Locale.getISOCountries();
        for(String countryCode : locales){
            Locale obj = new Locale("", countryCode);
            countryResponseList.add(new CountryResponse(obj.getCountry(), obj.getDisplayCountry()));
        }
        return countryResponseList;
    }
}
