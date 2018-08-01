package com.brothersoft.bookofcountries.injection;


import com.brothersoft.bookofcountries.presentation.screens.country.list.CountryListViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    void runInject(CountryListViewModel listViewModel);

}
