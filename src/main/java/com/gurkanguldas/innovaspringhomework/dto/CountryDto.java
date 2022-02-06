package com.gurkanguldas.innovaspringhomework.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class CountryDto
{
    @NotNull(message = "Ulke id'si bos birakilamaz.")
    @Min(value=0,message = "Ulke id'si 0'dan kucuk olamaz.(0=ekle, 0!=guncelle")
    private Long countryId;

    @NotEmpty(message = "Ulkenin adi bos birakilamaz.")
    private String countryName;

    @NotEmpty(message = "Ulkenin bulundugu kita bos birakilamaz.")
    private String countryContinent;

    @NotNull(message = "Ulkenin nufus sayisi bos birakilamaz.")
    @Min(value=0,message = "Ulkenin nufus sayisi 0'dan kucuk olamaz.")
    private Integer countryPopulation;

    @NotNull(message = "Ulkenin yuz olcumu bos birakilamaz.")
    @Min(value=0,message = "Ulkenin yuz olcumu 0'dan kucuk olamaz.")
    private Double countryArea;

    @NotNull(message = "Ulkenin komsu sayisi bos birakilamaz.")
    @Min(value=0,message = "Ulkenin komsu sayisi 0'dan kucuk olamaz.")
    private Integer countryNeighbors;

    @NotNull(message = "Ulkenin kurulus yili bos birakilamaz.")
    private Integer countryFoundingYear;

}
