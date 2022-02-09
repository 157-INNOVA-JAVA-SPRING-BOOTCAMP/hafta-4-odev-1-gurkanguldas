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
public class CityDto
{
    @NotNull(message = "Sehir id'si bos birakilamaz.")
    @Min(value=0,message = "Sehir id'si 0'dan kucuk olamaz.(0=ekle, 0!=guncelle")
    private Long cityId;

    @NotEmpty(message = "Sehrin adi bos birakilamaz.")
    private String cityName;

    @NotNull(message = "Sehrin nufus sayisi bos birakilamaz.")
    @Min(value=0,message = "Sehrin nufus sayisi 0'dan kucuk olamaz.")
    private Integer cityPopulation;

    @NotNull(message = "Sehrin alan kodu bos birakilamaz.")
    @Min(value=0,message = "Sehrin alan kodu 0'dan kucuk olamaz.")
    private Integer cityAreaCode;

    @NotNull(message = "Sehrin yuz olcumu bos birakilamaz.")
    @Min(value=0,message = "Sehrin yuz olcumu 0'dan kucuk olamaz.")
    private Double cityArea;

    @NotEmpty(message = "Sehrin bulundugu ulke bos birakilamaz.")
    private String countryName;

}
