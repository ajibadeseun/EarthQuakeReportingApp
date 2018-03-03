package com.example.android.quakereport;

/**
 * Created by DAMILOLA on 8/10/2017.
 */

public class EarthQuake {
    private double mag;
    private String location;
    private long timeInMilliSeconds;
    private String url;
    public EarthQuake(){}
    public EarthQuake(double mag,String location, long timeInMilliseconds, String url){
        this.mag = mag;
        this.location = location;
        this.timeInMilliSeconds = timeInMilliseconds;
        this.url = url;
    }
    public double getMag(){return mag;}
    public void setMag(double mag){this.mag = mag;}
    public String getLocation(){return location;}
    public void setLocation(String location){this.location = location;}
    public long getTimeInMilliSeconds(){return timeInMilliSeconds;}
    public void setTimeInMilliSeconds(long timeInMilliSeconds){this.timeInMilliSeconds = timeInMilliSeconds;}
    public String getUrl(){return url;}
    public void setUrl(String url){this.url = url;}
}
