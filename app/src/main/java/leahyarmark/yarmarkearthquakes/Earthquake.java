package leahyarmark.yarmarkearthquakes;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by student1 on 12/3/2015.
 */
public class Earthquake implements Serializable {
    private Features[] feature;

    public String getPlace(int i) {
        return feature[i].getPlace();
    }
}
