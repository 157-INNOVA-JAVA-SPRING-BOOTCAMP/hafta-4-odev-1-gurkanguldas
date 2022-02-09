package com.gurkanguldas.innovaspringhomework.services;

import com.gurkanguldas.innovaspringhomework.controller.CountryController;
import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class CountryServices
{
    @GetMapping("/country/rest/listcountry")
    public List<CountryEntity> getProductList(){
        return CountryController.countryEntityList;
    }
}
