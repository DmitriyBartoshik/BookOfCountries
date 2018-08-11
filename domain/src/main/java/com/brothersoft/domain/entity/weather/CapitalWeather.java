package com.brothersoft.domain.entity.weather;

import com.brothersoft.domain.entity.DomainModel;

import java.util.Date;
import java.util.List;

public class CapitalWeather implements DomainModel {
    private Coordinate coord;
    private List<WeatherDescription> weather;
    private String base;
    private WeatherData main;
    private int visibility;
    private Wind wind;
    private Cloud clouds;
    private long dt;
    private SunData sys;
    private int id;
    private String name;
    private int cod;

    public Coordinate getCoord() {
        return coord;
    }

    public List<WeatherDescription> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public WeatherData getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Cloud getClouds() {
        return clouds;
    }

    public long getDt() {
        return dt;
    }

    public SunData getSys() {
        return sys;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }
}
