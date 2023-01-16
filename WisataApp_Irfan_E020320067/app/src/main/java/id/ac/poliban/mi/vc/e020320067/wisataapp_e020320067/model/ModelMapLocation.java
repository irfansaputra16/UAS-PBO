package id.ac.poliban.mi.vc.e020320067.wisataapp_e020320067.model;

import com.google.android.gms.maps.model.LatLng;


public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}
