package com.brothersoft.bookofcountries.presentation.screens.country.group;

import com.brothersoft.bookofcountries.app.App;
import com.brothersoft.bookofcountries.presentation.base.BaseViewModel;
import com.brothersoft.bookofcountries.presentation.screens.country.list.CountryListAdapter;
import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.usecases.GetCountryGroupUseCase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CountryGroupViewModel extends BaseViewModel<CountryGroupRouter> {
    public CountryListAdapter adapter = new CountryListAdapter();
    @Inject
    public GetCountryGroupUseCase countryGroupUseCase;

    @Override
    protected void runInject() {
        App.getAppComponent().runInject(this);
    }

    public void getRegionsCountries(String region) {
        countryGroupUseCase.getRegionsCountries(region).subscribe(new Observer<List<Country>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<Country> countries) {
                adapter.setItems(countries);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}
// android:onClick="@{(v)->viewModel.itemClicked(v)}"