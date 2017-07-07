package com.example.colonyalbert.coolweather.util;

import android.text.TextUtils;

import com.example.colonyalbert.coolweather.db.City;
import com.example.colonyalbert.coolweather.db.County;
import com.example.colonyalbert.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ColonyAlbert on 2017/7/7.
 * Work Hard In Silence.
 * Let Success Be Your Noise.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i<allProvinces.length() ;i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }
                return true;
            }
            catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response,int provincedId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities = new JSONArray(response);
                for (int i = 0;i<allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provincedId);
                    city.save();
                }
                return true;
            }
            catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0;i<allCounties.length();i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }
            catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
