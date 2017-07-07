package com.example.colonyalbert.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ColonyAlbert on 2017/7/7.
 * Work Hard In Silence.
 * Let Success Be Your Noise.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
