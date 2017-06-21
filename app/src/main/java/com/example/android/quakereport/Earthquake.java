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
    private String mPlace;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** magnitude colors for the circles **/

    private int mMagnitudeColor;

    /**get the resource color Id */

    private int mMagnitudeColorResourceId;


    /**
     * Create a new Earthquake object
     *
     * @param magnitude is the magnitude of the Seism
     * @param place is where the Earthquake happens
     * @param timeInMilliseconds is the date when the seism happens
     */
    public Earthquake(Double magnitude, String place, long timeInMilliseconds, int magnitudeColor, int magnitudeColorResourceId ) {
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mMagnitudeColor = magnitudeColor;
        mMagnitudeColorResourceId = magnitudeColorResourceId;

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
    public String getPlace() {
        return mPlace;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the color of the circle, according to the magnitude intensity
     */

    public int getMagnitudeColor()  {
        return mMagnitudeColor;
    }

    /**
     * Returns the color of the circle color resource, according to the magnitude intensity
     */

    public int getMagnitudeColorResourceId()  {
        return mMagnitudeColorResourceId;
    }

}