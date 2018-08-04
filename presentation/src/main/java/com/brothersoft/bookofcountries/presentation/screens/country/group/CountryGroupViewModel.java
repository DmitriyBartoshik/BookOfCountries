package com.brothersoft.bookofcountries.presentation.screens.country.group;

import com.brothersoft.bookofcountries.app.App;
import com.brothersoft.bookofcountries.presentation.base.BaseViewModel;

public class CountryGroupViewModel extends BaseViewModel<CountryGroupRouter> {

    @Override
    protected void runInject() {
        App.getAppComponent().runInject(this);
    }
}
// android:onClick="@{(v)->viewModel.itemClicked(v)}"