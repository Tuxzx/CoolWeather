package com.example.tuxzx.coolweather.gson;

/**
 * Created by tuxzx on 2017/12/31.
 */

public class AQI {
    public AQIcity city;

    public class AQIcity {
        public String aqi;
        public String pm25;
    }
}
