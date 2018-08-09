package com.brothersoft.bookofcountries.presentation.screens.country.list;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import com.brothersoft.bookofcountries.presentation.base.recycler.BaseItemViewHolder;
import com.brothersoft.bookofcountries.presentation.base.recycler.BaseRecyclerViewAdapter;
import com.brothersoft.domain.entity.Country;

import java.util.List;


public class CountryListAdapter extends BaseRecyclerViewAdapter<Country, CountryItemViewModel> {
    @NonNull
    @Override
    public BaseItemViewHolder<Country, CountryItemViewModel, ?> onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return CountryItemViewHolder.create(parent, new CountryItemViewModel());
    }
}