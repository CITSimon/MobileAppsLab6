package ie.cit.android.flightsearch.model;

import java.io.Serializable;

/**
 * Created by Simon on 28/10/2015.
 */
public class Flight implements Serializable{
    private String origin;
    private String destination;

    public Flight(String origin, String destination)
    {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString()
    {
        return this.origin + " - " +this.destination;
    }
}
