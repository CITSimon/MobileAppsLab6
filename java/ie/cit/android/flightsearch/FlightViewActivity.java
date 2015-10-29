package ie.cit.android.flightsearch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ie.cit.android.flightsearch.R;
import ie.cit.android.flightsearch.model.Flight;

/**
 * Created by Simon on 28/10/2015.
 */
public class FlightViewActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flightview);
        Flight flightObj = (Flight)getIntent().getSerializableExtra("selectedFlight");
        TextView textView = (TextView)findViewById(R.id.flightDisplayField);
        textView.setText(flightObj.toString());
    }
}
