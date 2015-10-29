package ie.cit.android.flightsearch.controller;

import java.util.ArrayList;

import ie.cit.android.flightsearch.model.Flight;

/**
 * Created by Simon on 28/10/2015.
 */
public class MainController
{
    //Static instance variable
    private static MainController instance;
    private ArrayList<Flight> flightsList;

    private MainController()
    {
        this.flightsList = new ArrayList<Flight>();
    }

    public static MainController getInstance()
    {
        if(instance == null)
        {
            instance = new MainController();
        }
        return instance;
    }
    public void addFlight(String origin, String destination)
    {
        Flight f = new Flight(origin, destination);
        this.flightsList.add(f);
    }

    public ArrayList<Flight> getFlights()
    {
        return this.flightsList;
    }

}
