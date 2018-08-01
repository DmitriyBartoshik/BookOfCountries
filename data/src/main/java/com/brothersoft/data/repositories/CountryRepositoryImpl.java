package com.brothersoft.data.repositories;

import com.brothersoft.data.net.RestService;
import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.repositories.CountryRepository;

import java.util.List;
import javax.inject.Inject;

import io.reactivex.Observable;

public class CountryRepositoryImpl implements CountryRepository {

    private RestService restService;

    @Inject
    public CountryRepositoryImpl(RestService restService) {
        this.restService = restService;
    }


    @Override
    public Observable<List<Country>> getAllCountries() {
        return restService.getAllCountries();
    }

    @Override
    public Observable<Country> getCountry() {
        return null;
    }
}
