package ie.cit.android.flightsearch;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Simon on 21/10/2015.
 */
public class MainActivity extends Activity implements TopFragment.FlightSearcher
{
    @Override
    public void refreshFlightList() {
        BottomFragment bottomFragment = (BottomFragment)getFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomFragment.refreshList();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
