package leahyarmark.yarmarkearthquakes;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by student1 on 12/3/2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<EarthquakeViewHolder> {
    private Earthquake[] earthquakes;

    public RecyclerViewAdapter(Earthquake[] earthquakes) {
        this.earthquakes = earthquakes;
    }

    @Override
    public EarthquakeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(EarthquakeViewHolder earthquakeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
