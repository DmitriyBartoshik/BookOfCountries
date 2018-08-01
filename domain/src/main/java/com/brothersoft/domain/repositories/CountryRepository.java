package com.brothersoft.domain.repositories;

import com.brothersoft.domain.entity.Country;


import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

public interface CountryRepository {

    Observable<List<Country>> getCountries();
    Observable<Country> getCountry();

//    Observable<List<Country>> search(Search search);
}
