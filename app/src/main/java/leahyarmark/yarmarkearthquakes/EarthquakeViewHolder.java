package leahyarmark.yarmarkearthquakes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public EarthquakeViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Earthquake earthquake, int index) {
        name.setText(earthquake.getPlace(index));
    }
}
