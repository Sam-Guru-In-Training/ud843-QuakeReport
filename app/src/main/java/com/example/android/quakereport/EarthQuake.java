package com.example.android.quakereport;

/**
 * Created by Anand Prabhu on 22/07/16.
 * {@link Earthquake} represents the specific earth quake data
 * Each object has 3 properties: magnitude, location and date
 */
public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the specific earthquake
    private String mLocation;

    // Date when the earthquake occurred
    private long mTime;

    // URL of the earthquake website report
    private String mUrl;

    /**
     * Create a new Earthquake object.
     *
     * @param vMagnitude is the magnitude of the earth quake
     * @param vLocation is the location of the specific earth quake
     * @param vTime is the date when earth quake occurred
     */
    public Earthquake(double vMagnitude, String vLocation, long vTime, String vUrl) {
        this.mMagnitude = vMagnitude;
        this.mLocation = vLocation;
        this.mTime = vTime;
        this.mUrl = vUrl;
    }

    /**
     * Get the magnitude of the earth quake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earth quake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date when earth quake occurred
     */
    public long getTime() {
        return mTime;
    }

    /**
     * Get the URL of the earthquake website report
     */
    public String getReportUrl() {
        return mUrl;
    }
}
