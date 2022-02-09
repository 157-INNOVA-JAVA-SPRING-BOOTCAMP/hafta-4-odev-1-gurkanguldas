package com.gurkanguldas.innovaspringhomework.controller;

import com.gurkanguldas.innovaspringhomework.dto.CountryDto;
import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import com.gurkanguldas.innovaspringhomework.repository.CountryRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@Log4j2
public class CountryController
{
    @Autowired
    CountryRepository countryRepository;

    public static List<CountryEntity> countryEntityList;

    @GetMapping("/country/register")
    public String getRegister(Model model)
    {
        model.addAttribute("key_form", new CountryDto());
        return "CountryRegister";
    }

    @PostMapping("/country/register")
    public String postRegister(@Valid @ModelAttribute("key_form") CountryDto dto, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            log.error("Hata var");
            log.info(dto);
            return "CountryRegister";
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
        return "CountryRegister";
    }

    @GetMapping("/country/delete")
    public String getDelete(@RequestParam(name = "countryid")Long id,  Model model)
    {
        Optional<CountryEntity> optional=countryRepository.findById(id);
        if(optional.isPresent())
        {
            CountryEntity computerEntity2= optional.get();
            countryRepository.deleteById(id);
        }

        countryEntityList = countryRepository.findAll();

        model.addAttribute("country_table",countryEntityList);
        return "CountryTable";
    }

    @GetMapping("/country/findall")
    public String getFindAll(Model model)
    {
        countryEntityList = countryRepository.findAll();

        model.addAttribute("country_table",countryEntityList);
        return "CountryTable";
    }

    @GetMapping("/country/findall/{page}")
    public String getSortCountry(@PathVariable(name = "page")String sortType, @RequestParam(name = "descending") Boolean descending,  Model model)
    {
        Sort sort;

        if(descending)
            sort=Sort.by(sortType).descending();
        else
            sort=Sort.by(sortType);

        countryEntityList = countryRepository.findAll(sort);
        model.addAttribute("country_table",countryEntityList);
        return "CountryTable";
    }
}
