package com.brothersoft.bookofcountries.presentation.screens.country.list;

import android.app.Activity;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.ahmadrosid.svgloader.SvgLoader;
import com.brothersoft.bookofcountries.R;
import com.brothersoft.bookofcountries.presentation.base.recycler.BaseItemViewModel;
import com.brothersoft.domain.entity.Country;
import com.squareup.picasso.Picasso;


public class CountryItemViewModel extends BaseItemViewModel<Country> {
    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> capital = new ObservableField<>("");
    public ObservableField<String> region = new ObservableField<>("");
    public ObservableField<String> imageUrl = new ObservableField<>("");

    private int position = 0;
    private Country country;


    @Override
    public void setItem(Country country, int position) {
        this.name.set(country.getName());
        this.capital.set(country.getCapital());
        this.region.set(country.getRegion());
        this.imageUrl.set("https://randomuser.me/api/portraits/thumb/men/18.jpg"      );


//        this.imageUrl.set(country.getFlagsURL());
    }

//    @BindingAdapter("imageUrl")
//    public static void loadImage(ImageView view, String url,Context context) {
//        SvgLoader.pluck()
//                .with((Activity)context)
//                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
//                .load(url, view);

//        Picasso.get()
//                .load(url)
//                .resize(60, 60)
//                .centerCrop()
//                .into(view);
//    }
}
