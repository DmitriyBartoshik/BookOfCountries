package com.brothersoft.bookofcountries.presentation.screens.country.single;

import android.databinding.ObservableField;

import com.brothersoft.bookofcountries.presentation.base.recycler.BaseItemViewModel;
import com.brothersoft.domain.entity.Currency;

public class CurrencyItemViewModel extends BaseItemViewModel<Currency> {
    public ObservableField<String> currencyCode = new ObservableField<>("");

    public Currency currency;
    public int position = 0;

    @Override
    public void setItem(Currency currency, int position) {
        this.currencyCode.set(currency.getCode());
    }
}
