import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import leahyarmark.yarmarkearthquakes.Earthquake;
import leahyarmark.yarmarkearthquakes.RecyclerViewAdapter;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeAsyncTask extends AsyncTask<Earthquake, String, String> {

    private TextView textView;

    public EarthquakeAsyncTask(TextView textView) {
        this.textView = textView;
    }


    @Override
    protected void onPostExecute(String s) {

    }

    @Override
    protected String doInBackground(Earthquake[] params) {

        URL url = null;
        try {
            url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        InputStream in = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            in = url.openStream();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return null;

    }


}