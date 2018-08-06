package com.brothersoft.bookofcountries.presentation.screens.country.single;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.util.Log;

import com.brothersoft.bookofcountries.app.App;
import com.brothersoft.bookofcountries.presentation.base.BaseViewModel;
import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.entity.Language;
import com.brothersoft.domain.usecases.GetCountryUseCase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CountryViewModel extends BaseViewModel<CountryRouter> {

    public ObservableField<String> name = new ObservableField<String>();
    public ObservableField<String> capital = new ObservableField<String>();
    public ObservableField<String> region = new ObservableField<String>();
    public ObservableField<String> flag = new ObservableField<>("");

    public LanguageListAdapter languageListAdapter = new LanguageListAdapter();
    public CurrencyListAdapter currencyListAdapter=new CurrencyListAdapter();

    @Inject
    public GetCountryUseCase countryUseCase;

    @Override
    protected void runInject() {
        App.getAppComponent().runInject(this);
    }

    public CountryViewModel() {

    }

    public void getCountry(String name) {
        countryUseCase.getCountry(name).subscribe(new Observer<Country>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Country country) {
                languageListAdapter.setItems(country.getLanguages());
                currencyListAdapter.setItems(country.getCurrencies());
                setCountryField(country);
            }

            @Override
            public void onError(Throwable e) {
                router.showError(e);
                router.finishActivity();
            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void setCountryField(Country country) {
        this.name.set(country.getName());
        this.capital.set(country.getCapital());
        this.region.set(country.getRegion());
        this.flag.set(country.getFlag());
    }

    public void openRegionsCountries() {
        String focusRegion = region.get();
        router.goToRegionsCountries(focusRegion);
    }
}
