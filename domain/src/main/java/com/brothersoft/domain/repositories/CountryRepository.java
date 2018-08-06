package com.brothersoft.domain.repositories;

import com.brothersoft.domain.entity.Country;


import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

public interface CountryRepository {

    Observable<List<Country>> getAllCountries();

    Observable<List<Country>> getCountryGroupList(String field, String fieldValue);

    Observable<Country> getCountry(String alpha3Code);

//    Observable<List<Country>> search(Search search);
}
