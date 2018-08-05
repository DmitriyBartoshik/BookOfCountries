package com.brothersoft.data.net;

import com.brothersoft.domain.entity.Country;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestApi {

//    @GET("data/User")
//    Observable<List<UserResponse>> getAllUsers();
//
//    @GET("data/User/{id}")
//    Observable<UserResponse> getUser(@Path("id") String id);
//
//    @PUT("data/User/{id}")
//    Completable updateUser(@Body UserRequest user, @Path("id") String id);
//
//    @POST("data/User")
//    Observable<UserResponse> addUser(@Body UserRequest user);
//
//    @DELETE("data/User/{id}")
//    Completable deleteUser(@Path("id") String id);

    @GET("all")
    Observable<List<Country>> getAllCountries();
    @GET("region/{region}")
    Observable<List<Country>> getRegionsCountries(@Path("region") String region);

    @GET("alpha/{alpha3Code}")
    Observable<Country> getCountry(@Path("alpha3Code") String name);
}
