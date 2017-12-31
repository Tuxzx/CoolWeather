package com.example.tuxzx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tuxzx on 2017/12/31.
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
