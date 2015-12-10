package leahyarmark.yarmarkearthquakes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by student1 on 12/3/2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<EarthquakeViewHolder> {
    private Earthquake earthquakes;

    public RecyclerViewAdapter(Earthquake earthquakes) {
        this.earthquakes = earthquakes;
    }

    @Override
    public EarthquakeViewHolder onCreateViewHolder(
            ViewGroup viewGroup, int i) {
        View earthquakeView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);
        return new EarthquakeViewHolder(earthquakeView);
    }

    @Override
    public void onBindViewHolder(EarthquakeViewHolder earthquakeViewHolder, int index) {
        earthquakeViewHolder.bind(earthquakes.getFeatures()[index]);
    }

    @Override
    public int getItemCount() {
        return earthquakes.getFeatures().length;
    }
}
