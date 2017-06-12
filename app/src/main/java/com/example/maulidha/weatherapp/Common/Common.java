package com.example.maulidha.weatherapp.Common;
import android.support.annotation.NonNull;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.media.Image;
import java.util.Date;

/**
 * Created by MAULIDHA on 5/30/2017.
 */

public class Common {
    public static  String API_KEY = "068b2ab8b5ed5acef37993bfe9e74524";
    public static String API_LINK="http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String lat,String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTeimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTeimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage (String icon) {
        return String.format("http://openweatherappmap.org/img/w/%s.png", icon);
    }

    public static String getDataNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
    }
