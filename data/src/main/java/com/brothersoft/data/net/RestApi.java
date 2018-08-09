package com.brothersoft.data.net;

import com.brothersoft.data.entity.response.CountryResponse;
import com.brothersoft.domain.entity.Country;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApi {

    @GET("all")
    Observable<List<CountryResponse>> getAllCountries();

    @GET("{field}/{fieldValue}")
    Observable<List<CountryResponse>> getCountryGroupList(@Path("field") String field, @Path("fieldValue") String fieldValue);

    @GET("alpha/{alpha3Code}")
    Observable<CountryResponse> getCountry(@Path("alpha3Code") String name);
}
