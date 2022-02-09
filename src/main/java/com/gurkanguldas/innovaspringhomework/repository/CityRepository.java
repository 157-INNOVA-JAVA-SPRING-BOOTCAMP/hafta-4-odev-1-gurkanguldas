package com.gurkanguldas.innovaspringhomework.repository;

import com.gurkanguldas.innovaspringhomework.entity.CityEntity;
import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<CityEntity,Long>
{
    List<CityEntity> findCityEntitiesByCountryName(String countryName);
}
