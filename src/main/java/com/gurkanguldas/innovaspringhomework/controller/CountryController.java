package com.gurkanguldas.innovaspringhomework.controller;

import com.gurkanguldas.innovaspringhomework.dto.CountryDto;
import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import com.gurkanguldas.innovaspringhomework.repository.CountryRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class CountryController
{
    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/country/register")
    public String getRegister(Model model)
    {
        model.addAttribute("key_form", new CountryDto());
        return "register";
    }

    @PostMapping("/country/register")
    public String postForm(@Valid @ModelAttribute("key_form") CountryDto dto, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(dto);
            return "register";
        }

        CountryEntity entity = CountryEntity.builder()
                .countryId(dto.getCountryId())
                .countryArea(dto.getCountryArea())
                .countryPopulation(dto.getCountryPopulation())
                .countryContinent(dto.getCountryContinent())
                .countryFoundingYear(dto.getCountryFoundingYear())
                .countryName(dto.getCountryName())
                .countryNeighbors(dto.getCountryNeighbors())
                .build();

        countryRepository.save(entity);
        log.info(entity);
        return "register";
    }
}
