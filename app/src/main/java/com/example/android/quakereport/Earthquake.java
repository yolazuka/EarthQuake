package com.example.android.quakereport;

/**
 * Created by Usuario on 10/6/17.
 */

/**
 * {@link Earthquake} represent the information gathered from the Earthquakes around the world
 */
public class Earthquake {

    /** Magnitude of the Earthquake*/
    private Double mMagnitude;

    /** Place where the Earthquake ocurres */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    /**
     * Create a new Earthquake object
     *
     * @param magnitude is the magnitude of the Seism
     * @param location is where the Earthquake happens
     * @param timeInMilliseconds is the date when the seism happens
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the magnitude of the seism
     */
    public Double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get place where the seism ocurres
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get place where the seism ocurres
     */
    public String getUlr() {
        return mUrl;
    }

}