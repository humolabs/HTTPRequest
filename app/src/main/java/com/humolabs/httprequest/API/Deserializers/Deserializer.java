package com.humolabs.httprequest.API.Deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.humolabs.httprequest.Models.Ciudad;

import java.lang.reflect.Type;

/**
 * Created by rodo on 17/5/2017.
 */

public class Deserializer implements JsonDeserializer<Ciudad>{
    @Override
    public Ciudad deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        int mId = json.getAsJsonObject().get("id").getAsInt();
        String mNombre = json.getAsJsonObject().get("name").getAsString();
        String mPais = json.getAsJsonObject().get("sys").getAsJsonObject().get("country").getAsString();

        Ciudad mCiudad = new Ciudad(mId, mNombre, mPais);
        return mCiudad;
    }
}
