package com.tikal.fuze.data.api;

import com.tikal.fuze.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class SalaryPrefs {

    private static volatile SalaryPrefs singleton;
    private SalaryService api;

    public static SalaryPrefs get() {
        if (singleton == null) {
            synchronized (SalaryPrefs.class) {
                singleton = new SalaryPrefs();
            }
        }
        return singleton;
    }

    private SalaryPrefs() {
        createApi();
    }

    private void createApi() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        if(BuildConfig.DEBUG) {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        }else {
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        final OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        api = new Retrofit.Builder()
                .baseUrl(SalaryService.ENDPOINT)
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create((SalaryService.class));
    }
}
