package com.brothersoft.domain.usecases;

import android.util.Log;

import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.executors.PostExecutionThread;
import com.brothersoft.domain.repositories.CountryRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetListCountryUseCase extends BaseUseCase{
    private static final String TAG = "AAA GetListUserUseCase";
    private CountryRepository userRepository;

    @Inject
    public GetListCountryUseCase(CountryRepository userRepository,
                              PostExecutionThread postExecutionThread) {
        super(postExecutionThread);
        Log.d(TAG, "GetListUserUseCase: constructor");
        this.userRepository = userRepository;
    }

    public Observable<List<Country>> getCountries() {
        Log.d(TAG, "getUsers: ");
        return userRepository
                .getAllCountries()
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
