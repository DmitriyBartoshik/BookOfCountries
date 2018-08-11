package com.brothersoft.data.repositories;

import com.brothersoft.data.net.WeatherRestService;
import com.brothersoft.domain.entity.weather.CapitalWeather;
import com.brothersoft.domain.repositories.WeatherRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class WeatherRepositoryImpl implements WeatherRepository {
    private WeatherRestService weatherRestService;

    @Inject
    public WeatherRepositoryImpl(WeatherRestService weatherRestService) {
        this.weatherRestService = weatherRestService;
    }

    @Override
    public Observable<CapitalWeather> getCapitalWeather(String capital) {
        return weatherRestService.getCapitalWeather(capital);
    }
}
