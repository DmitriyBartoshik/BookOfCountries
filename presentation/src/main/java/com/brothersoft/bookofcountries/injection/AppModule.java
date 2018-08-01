package com.brothersoft.bookofcountries.injection;

import android.content.Context;

import com.brothersoft.bookofcountries.executor.UIThread;
import com.brothersoft.data.net.RestService;
import com.brothersoft.data.repositories.CountryRepositoryImpl;
import com.brothersoft.domain.executors.PostExecutionThread;
import com.brothersoft.domain.repositories.CountryRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    public static CountryRepository provideCountryRepository(CountryRepositoryImpl countryRepository) {
        return new CountryRepositoryImpl(new RestService());
    }

    @Singleton
    @Provides
    public static PostExecutionThread provideUIThread(UIThread uiThread) {
        return uiThread;
    }
}
