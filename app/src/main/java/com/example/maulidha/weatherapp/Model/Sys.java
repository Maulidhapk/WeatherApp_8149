package com.example.maulidha.weatherapp.Model;

/**
 * Created by MAULIDHA on 5/30/2017.
 */

public class Sys {
    private int trpe;
    private int id;
    private double message;
    private String country;
    private double sunrise;
    private double sunset;

    public Sys(int trpe, int id, double message, String country, double sunrise, double sunset) {
        this.trpe = trpe;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getTrpe() {
        return trpe;
    }

    public void setTrpe(int trpe) {
        this.trpe = trpe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(double sunrise) {
        this.sunrise = sunrise;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }
}
