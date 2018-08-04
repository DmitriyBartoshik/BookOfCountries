package com.brothersoft.domain.usecases;

import android.util.Log;

import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.executors.PostExecutionThread;
import com.brothersoft.domain.repositories.CountryRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetListCountryUseCase extends BaseUseCase{
    private CountryRepository countryRepository;

    @Inject
    public GetListCountryUseCase(CountryRepository countryRepository,
                              PostExecutionThread postExecutionThread) {
        super(postExecutionThread);
        this. countryRepository = countryRepository;
    }

    public Observable<List<Country>> getCountries() {
        return  countryRepository
                .getAllCountries()
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}