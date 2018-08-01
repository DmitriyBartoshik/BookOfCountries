package com.brothersoft.bookofcountries.presentation.screens.country.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.brothersoft.bookofcountries.databinding.ItemCountryBinding;
import com.brothersoft.bookofcountries.presentation.base.recycler.BaseItemViewHolder;
import com.brothersoft.domain.entity.Country;

public class CountryItemViewHolder extends BaseItemViewHolder<Country, CountryItemViewModel, ItemCountryBinding> {

    public CountryItemViewHolder(CountryItemViewModel viewModel, ItemCountryBinding binding) {
        super(viewModel, binding);
    }

    public static CountryItemViewHolder create(ViewGroup parent, CountryItemViewModel viewModel) {
        ItemCountryBinding binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return  new CountryItemViewHolder(viewModel, binding);
    }
}
