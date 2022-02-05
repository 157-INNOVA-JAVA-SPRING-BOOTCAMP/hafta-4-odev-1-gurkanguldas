package com.gurkanguldas.innovaspringhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.*;
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
    @NotNull(message = "Ulke id'si bos birakilamaz.")
    @Min(value=0,message = "Ulke id'si 0'dan kucuk olamaz.(0=ekle, 0!=guncelle")
    private Long countryId;

    @NotEmpty(message = "Ulkenin adi bos birakilamaz.")
    @Column(name = "country_name")
    private String countryName;

    @NotEmpty(message = "Ulkenin bulundugu kita bos birakilamaz.")
    @Column(name = "country_continent")
    private String countryContinent;

    @NotNull(message = "Ulkenin nufus sayisi bos birakilamaz.")
    @Min(value=0,message = "Ulkenin nufus sayisi 0'dan kucuk olamaz.")
    @Column(name = "country_population")
    private Integer countryPopulation;

    @NotNull(message = "Ulkenin yuz olcumu bos birakilamaz.")
    @Min(value=0,message = "Ulkenin yuz olcumu 0'dan kucuk olamaz.")
    @Column(name = "country_area")
    private Double countryArea;

    @NotNull(message = "Ulkenin komsu sayisi bos birakilamaz.")
    @Min(value=0,message = "Ulkenin komsu sayisi 0'dan kucuk olamaz.")
    @Column(name = "country_neighbors")
    private Integer countryNeighbors;

    @NotNull(message = "Ulkenin kurulus yili bos birakilamaz.")
    @Column(name = "country_founding_year")
    private Integer countryFoundingYear;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;


}
