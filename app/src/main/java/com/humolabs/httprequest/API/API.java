package com.humolabs.httprequest.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.humolabs.httprequest.API.Deserializers.Deserializer;
import com.humolabs.httprequest.Models.Ciudad;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rodo on 16/5/2017.
 */

public class API {
    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final String APPID = "377bdb9196cc4c2bfb0cad686e34ee2f";
    private static Retrofit mRetrofit = null;

    public static Retrofit getApi(){
        if (mRetrofit == null){
            GsonBuilder mBuilder = new GsonBuilder();
            mBuilder.registerTypeAdapter(Ciudad.class, new Deserializer());

            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(mBuilder.create()))
                    .build();
        }
        return mRetrofit;
    }
}
