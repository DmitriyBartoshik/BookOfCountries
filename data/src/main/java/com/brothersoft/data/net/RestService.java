package com.brothersoft.data.net;

import android.util.Log;

import com.brothersoft.data.entity.HttpError;
import com.brothersoft.domain.entity.Country;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

@Singleton
public class RestService {

    private RestApi restApi;
    private Gson gson;
    private static final String REQUEST_URL =
            "https://restcountries.eu/rest/v2/";
    private ErrorParserTransformer errorParserTransformer;


    @Inject
    public RestService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient
                .Builder()
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();

        gson = new GsonBuilder()
                .create();

        this.restApi = new Retrofit
                .Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(REQUEST_URL)
                .client(okHttpClient)
                .build()
                .create(RestApi.class);

        errorParserTransformer = new ErrorParserTransformer(gson);
    }
    public Observable<List<Country>> getAllCountries() {
        Log.d(TAG, "getAllCountries: ");
        return restApi
                .getAllCountries();
//                .compose(errorParserTransformer.<List<CountryResponse>, HttpError>parseHttpError());
    }

    public Observable<Country> getUser(String id) {
        Log.d(TAG, "getUser: ");
        return restApi
                .getCountry();
//                .compose(errorParserTransformer.<UserResponse, HttpError>parseHttpError());
    }
}
