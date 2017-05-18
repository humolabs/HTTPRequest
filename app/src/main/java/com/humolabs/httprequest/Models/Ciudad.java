package com.humolabs.httprequest.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rodo on 15/5/2017.
 */

public class Ciudad {
    private int id;
    //@SerializedName("name")
    private String nombre;
    //como tiene distinto nombre agrego la anotación
   /*
    @SerializedName("main")
    private Temperatura temperatura;
    */

    private String pais;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /*
    public Ciudad(int id, String nombre, Temperatura temperatura) {
        this.id = id;
        this.nombre = nombre;
        this.temperatura = temperatura;
    }
    */

    public Ciudad(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    //para Deserializar objetos
    public static Temperatura parseJSON(String response){
        Gson gson = new GsonBuilder().create();
        Temperatura temp = gson.fromJson(response, Temperatura.class);
        return temp;
    }
    */
}
