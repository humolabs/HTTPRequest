package com.humolabs.httprequest.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rodo on 16/5/2017.
 */

public class Temperatura {
    //como tiene distinto nombre agrego la anotación
    @SerializedName("temp")
    private float temperatura;
    @SerializedName("pressure")
    private float presion;
    @SerializedName("humidity")
    private float humedad;
    @SerializedName("temp_max")
    private float tempMax;
    @SerializedName("temp_min")
    private float tempMin;


    public Temperatura() {
    }

    public Temperatura(float temperatura, float presion, float humedad, float tempMax, float tempMin) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.humedad = humedad;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }
}
