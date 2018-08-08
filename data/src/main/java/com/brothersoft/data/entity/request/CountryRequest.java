package com.brothersoft.data.entity.request;

import com.brothersoft.data.entity.DataModel;

import java.util.List;

public class CountryRequest implements DataModel {
    private String name;
    private List<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes;
    private String capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private int population;
    private List<Double> latlng;
    private String demonym;
    private double area;
    private double gini;
    private List<String> timezones;
    private List<String> borders;
    private String nativeName;
    private int numericCode;
    private List<CurrencyRequest> currencies;
    private List<LanguageRequest> languages;
    private TranslationRequest translations;
    private String flag;
    private List<RegionalBlockRequest> regionalBlocs;
    private String cioc;

    public void setName(String name) {
        this.name = name;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }

    public void setCurrencies(List<CurrencyRequest> currencies) {
        this.currencies = currencies;
    }

    public void setLanguages(List<LanguageRequest> languages) {
        this.languages = languages;
    }

    public void setTranslations(TranslationRequest translations) {
        this.translations = translations;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setRegionalBlocs(List<RegionalBlockRequest> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }



}
