package com.example.tuxzx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tuxzx on 2017/12/31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {

        @SerializedName("loc")
        public String uodateTime;
    }
}
