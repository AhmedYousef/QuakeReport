package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeMilliseconds;
    private String url;

    Earthquake(double magnitude, String location, long timeMilliseconds, String url){
        this.magnitude = magnitude;
        this.location = location;
        this.timeMilliseconds = timeMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeMilliseconds() {
        return timeMilliseconds;
    }

    public String getUrl() {
        return url;
    }
}
