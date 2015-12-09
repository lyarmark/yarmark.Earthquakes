package leahyarmark.yarmarkearthquakes;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeAsyncTask extends AsyncTask<Void, Void, Earthquake> {

    private Earthquake earthquakes;
    private URLConnection urlConnection;

//do i need a constructor? what would it do?


    protected Earthquake doInBackground(Void... params) {
        try {
            URL url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            InputStream in = new BufferedInputStream(connection.getInputStream());

            earthquakes = gson.fromJson(new InputStreamReader(in), Earthquake.class);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return earthquakes;
    }
}