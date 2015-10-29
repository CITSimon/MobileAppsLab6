package ie.cit.android.flightsearch;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import ie.cit.android.flightsearch.controller.MainController;
import ie.cit.android.flightsearch.model.Flight;

/**
 * Created by Simon on 21/10/2015.
 */
public class BottomFragment extends ListFragment
{
    private ArrayAdapter<Flight> adapter;

    public void onActivityCreated(Bundle savedInstanceState)
    {
        ArrayList<Flight> flights = MainController.getInstance().getFlights();
        this.adapter = new ArrayAdapter<Flight>(getActivity(), android.R.layout.simple_list_item_1, flights);
        setListAdapter(this.adapter);

        super.onActivityCreated(savedInstanceState);
    }

    public void refreshList()
    {
        this.adapter.notifyDataSetChanged();
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(getActivity(), FlightViewActivity.class);
        Flight selectedFlight = MainController.getInstance().getFlights().get(position);
        i.putExtra("selectedFlight", selectedFlight);
        startActivity(i);
    }
}
