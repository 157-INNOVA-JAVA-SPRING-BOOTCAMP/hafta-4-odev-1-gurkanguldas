package com.gurkanguldas.innovaspringhomework.repository;

import com.gurkanguldas.innovaspringhomework.entity.CountryEntity;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<CountryEntity,Long>
{

}
