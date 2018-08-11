package com.brothersoft.data.net;

import com.brothersoft.domain.entity.weather.CapitalWeather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherRestApi {
    @GET("weather")
    Observable<CapitalWeather> getCapitalWeather(@Query("q") String q,@Query("appid")String appid);
}
