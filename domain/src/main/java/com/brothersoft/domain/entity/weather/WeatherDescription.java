package com.brothersoft.domain.entity.weather;

import com.brothersoft.domain.entity.DomainModel;

public class WeatherDescription implements DomainModel {
    private int id;
    private String main;
    private String description;
    private String icon;

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
