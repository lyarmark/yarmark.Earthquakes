package leahyarmark.yarmarkearthquakes;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeAsyncTask extends AsyncTask<Void, Void, Earthquake> {

    private Earthquake earthquakes;
    private RecyclerView recyclerView;

    public EarthquakeAsyncTask(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }


    @Override
    protected void onPostExecute(Earthquake earthquake) {
        super.onPostExecute(earthquake);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(earthquake);
        recyclerView.setAdapter(adapter);
    }

    protected Earthquake doInBackground(Void... params) {

        try {
            URL url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            InputStream in = (connection.getInputStream());
            this.earthquakes = gson.fromJson(new InputStreamReader(in), Earthquake.class);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return earthquakes;
    }
}