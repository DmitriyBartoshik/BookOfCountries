package com.brothersoft.bookofcountries.presentation.screens.country.list;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.brothersoft.bookofcountries.R;
import com.brothersoft.bookofcountries.databinding.ActivityCountryListBinding;
import com.brothersoft.bookofcountries.presentation.base.BaseMvvmActivity;

public class CountryListActivity extends BaseMvvmActivity<CountryListViewModel,
        ActivityCountryListBinding, CountryListRouter> {

    @Override
    protected CountryListViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(CountryListViewModel.class);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_country_list;
    }

    @Override
    protected CountryListRouter provideRouter() {
        return new CountryListRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.countryList.setLayoutManager(new LinearLayoutManager(this));
        binding.countryList.setAdapter(viewModel.adapter);
        binding.countryList.setHasFixedSize(true);
    }
}

