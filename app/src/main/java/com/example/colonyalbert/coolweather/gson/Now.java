package com.example.colonyalbert.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ColonyAlbert on 2017/7/7.
 * Work Hard In Silence.
 * Let Success Be Your Noise.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
