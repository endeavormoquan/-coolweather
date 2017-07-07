package com.example.colonyalbert.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ColonyAlbert on 2017/7/7.
 * Work Hard In Silence.
 * Let Success Be Your Noise.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

    public Update update;
}
