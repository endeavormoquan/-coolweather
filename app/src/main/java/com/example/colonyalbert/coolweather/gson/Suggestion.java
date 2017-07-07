package com.example.colonyalbert.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ColonyAlbert on 2017/7/7.
 * Work Hard In Silence.
 * Let Success Be Your Noise.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
