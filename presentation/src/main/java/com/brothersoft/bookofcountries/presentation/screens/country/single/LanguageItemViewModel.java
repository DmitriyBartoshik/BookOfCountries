package com.brothersoft.bookofcountries.presentation.screens.country.single;

import android.databinding.ObservableField;

import com.brothersoft.bookofcountries.presentation.base.recycler.BaseItemViewModel;
import com.brothersoft.domain.entity.Country;
import com.brothersoft.domain.entity.Language;

public class LanguageItemViewModel extends BaseItemViewModel<Language> {
    public ObservableField<String> nameIso639_1 = new ObservableField<>("");

    public Language language;
    public int position = 0;

    @Override
    public void setItem(Language language, int position) {
        this.nameIso639_1.set(language.getIso639_1());
    }
}