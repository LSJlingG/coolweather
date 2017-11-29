package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linG on 2017/11/27.
 */

public class Basic {
    //注释方式与JAVA建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
