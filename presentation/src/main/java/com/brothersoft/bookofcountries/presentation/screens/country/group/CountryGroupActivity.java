package com.brothersoft.bookofcountries.presentation.screens.country.group;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.brothersoft.bookofcountries.R;
import com.brothersoft.bookofcountries.databinding.ActivityCountryGroupBinding;
import com.brothersoft.bookofcountries.presentation.base.BaseMvvmActivity;
import com.brothersoft.bookofcountries.presentation.screens.country.single.CountryViewModel;

public class CountryGroupActivity extends BaseMvvmActivity<CountryGroupViewModel,
        ActivityCountryGroupBinding, CountryGroupRouter> {


    @Override
    protected CountryGroupViewModel provideViewModel() {
        return  ViewModelProviders.of(this).get(CountryGroupViewModel.class);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_country_group;
    }

    @Override
    protected CountryGroupRouter provideRouter() {
        return new CountryGroupRouter(this);
    }
}

