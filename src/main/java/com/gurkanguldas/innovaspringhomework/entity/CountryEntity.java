package com.gurkanguldas.innovaspringhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2


@Entity
@Table(name="country")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_continent")
    private String countryContinent;

    @Column(name = "country_population")
    private Integer countryPopulation;

    @Column(name = "country_area")
    private Double countryArea;

    @Column(name = "country_neighbors")
    private Integer countryNeighbors;

    @Column(name = "country_founding_year")
    private Integer countryFoundingYear;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;


}
