package com.brothersoft.bookofcountries.presentation.screens.country.single;

import com.brothersoft.bookofcountries.presentation.base.BaseRouter;
import com.brothersoft.bookofcountries.presentation.screens.country.group.CountryGroupActivity;

public class CountryRouter extends BaseRouter<CountryActivity> {
    public CountryRouter(CountryActivity activity) {
        super(activity);
    }


    public void goToRegionsCountries(String region) {
        activity.startActivity(CountryGroupActivity.getIntent(activity, region));
    }
}
