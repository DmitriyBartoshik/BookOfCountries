package com.brothersoft.bookofcountries.presentation.screens.country.list;

import com.brothersoft.bookofcountries.app.App;
import com.brothersoft.bookofcountries.presentation.base.BaseViewModel;

public class CountryListViewModel extends BaseViewModel<CountryListRouter> {

    @Override
    protected void runInject() {
        App.getAppComponent().runInject(this);
    }

    CountryListViewModel(){

    }
}
