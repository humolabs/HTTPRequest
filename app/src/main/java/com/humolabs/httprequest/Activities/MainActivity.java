package com.humolabs.httprequest.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.humolabs.httprequest.R;
import com.humolabs.httprequest.API.API;
import com.humolabs.httprequest.Models.Ciudad;
import com.humolabs.httprequest.API.APIServices.WeatherService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherService mService = API.getApi().create(WeatherService.class);

        //Call<Ciudad> mCiudadCall = mService.getCiudad("London,UK", API.APPID);
        Call<Ciudad> mCiudadCall = mService.getCiudadCelsiusES("Merlo,ar", API.APPID, "metric", "es");

        //llamada asincrona, la encola
        mCiudadCall.enqueue(new Callback<Ciudad>() {
            @Override
            public void onResponse(Call<Ciudad> call, Response<Ciudad> response) {
                Ciudad mCiudad = response.body();
            }

            @Override
            public void onFailure(Call<Ciudad> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
