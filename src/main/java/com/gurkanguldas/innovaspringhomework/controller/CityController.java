package com.gurkanguldas.innovaspringhomework.controller;

import com.gurkanguldas.innovaspringhomework.dto.CityDto;
import com.gurkanguldas.innovaspringhomework.dto.CountryDto;
import com.gurkanguldas.innovaspringhomework.entity.CityEntity;
import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import com.gurkanguldas.innovaspringhomework.repository.CityRepository;
import com.gurkanguldas.innovaspringhomework.repository.CountryRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Cipher;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@Log4j2
public class CityController
{
    @Autowired
    CityRepository cityRepository;

    @Autowired
    CountryRepository countryRepository;

    private static CountryEntity countryEntity;
    public static List<CityEntity> cityEntityList;

    @GetMapping("/country/city/register")
    public String getRegister(Model model)
    {
        model.addAttribute("key_form", new CityDto());
        return "CityRegister";
    }

    @PostMapping("/country/city/register")
    public String postRegister(@Valid @ModelAttribute("key_form") CityDto dto, BindingResult bindingResult)
    {
        log.info(countryEntity);
        if(bindingResult.hasErrors())
        {
            log.error("Hata var");
            log.info(dto);
            return "CityRegister";
        }

        CityEntity entity = CityEntity.builder()
                .cityId(dto.getCityId())
                .cityName(dto.getCityName())
                .cityPopulation(dto.getCityPopulation())
                .cityAreaCode(dto.getCityAreaCode())
                .cityArea(dto.getCityArea())
                .countryName(countryEntity.getCountryName())
                .build();

        cityRepository.save(entity);
        log.info(entity);
        return "CityRegister";
    }
    @GetMapping("/country/city/delete")
    public String getDelete(@RequestParam(name = "cityid")Long id, Model model)
    {
        Optional<CityEntity> optional=cityRepository.findById(id);
        if(optional.isPresent())
        {
            CityEntity cityEntity= optional.get();
            cityRepository.deleteById(id);
        }

        cityEntityList = cityRepository.findCityEntitiesByCountryName(countryEntity.getCountryName());
        model.addAttribute("city_table",cityEntityList);
        return "CityTable";
    }

    @GetMapping("/country/city")
    public String getFindAll(Model model,@RequestParam(name = "countryid")Long id)
    {
        countryEntity = countryRepository.getById(id);
        cityEntityList = cityRepository.findCityEntitiesByCountryName(countryEntity.getCountryName());
        model.addAttribute("city_table",cityEntityList);

        return "CityTable";
    }

    @GetMapping("/country/city/find/{page}")
    public String getSortCountry(@PathVariable(name = "page")String sortType, @RequestParam(name = "descending") Boolean descending, Model model)
    {
        cityEntityList = new ArrayList<>();
        Sort sort;
        if(descending)
            sort=Sort.by(sortType).descending();
        else
            sort=Sort.by(sortType);

        Iterable<CityEntity> cityEntities = cityRepository.findAll(sort);

        for (CityEntity cityEntity: cityEntities)
        {
            if(cityEntity.getCountryName().equals(countryEntity.getCountryName()))
                cityEntityList.add(cityEntity);
        }

        model.addAttribute("city_table",cityEntityList);
        return "CityTable";
    }
}
