package com.humolabs.httprequest.API.APIServices;

import com.humolabs.httprequest.Models.Ciudad;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rodo on 15/5/2017.
 */

public interface WeatherService {

    /*
        ejemplo call
        http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=377bdb9196cc4c2bfb0cad686e34ee2f

        para @get se pone wheater
        /weather?q=London,uk&appid=377bdb9196cc4c2bfb0cad686e34ee2f

        para query primer parametro se llama p y segundo appid
        q=London,uk&appid=377bdb9196cc4c2bfb0cad686e34ee2f
    */

    @GET("weather")
    Call<Ciudad> getCiudad(@Query("q") String ciudad,
                           @Query("appid") String key
    );

    @GET("weather")
    Call<Ciudad> getCiudadCelsius(@Query("q") String ciudad,
                                  @Query("appid") String key,
                                  @Query("units") String value
    );

    @GET("weather")
    Call<Ciudad> getCiudadCelsiusES(@Query("q") String ciudad,
                                    @Query("appid") String key,
                                    @Query("units") String value,
                                    @Query("lang") String lang
    );
}
