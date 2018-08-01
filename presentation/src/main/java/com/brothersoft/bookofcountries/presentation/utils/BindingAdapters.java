package com.brothersoft.bookofcountries.presentation.utils;
import android.app.Activity;
import android.app.Activity;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.ahmadrosid.svgloader.SvgLoader;
import com.brothersoft.bookofcountries.R;
import com.squareup.picasso.Picasso;

public class BindingAdapters {


    @BindingAdapter("imageUrl")
    public void loadImage(ImageView view, String url) {
        SvgLoader.pluck()
                .with((Activity))
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load(url, view);

        Picasso.get()
                .load(url)
                .resize(60, 60)
                .centerCrop()
                .into(view);
    }
}
