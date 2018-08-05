package com.brothersoft.domain.usecases;

import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.executors.PostExecutionThread;
import com.brothersoft.domain.repositories.CountryRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetCountryGroupUseCase extends BaseUseCase {
    private CountryRepository countryRepository;

    @Inject
    public GetCountryGroupUseCase(CountryRepository countryRepository,
                                  PostExecutionThread postExecutionThread) {
        super(postExecutionThread);
        this.countryRepository = countryRepository;
    }

    public Observable<List<Country>> getRegionsCountries(String region) {
        return countryRepository
                .getRegionsCountries(region)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
