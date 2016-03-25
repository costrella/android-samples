package com.costrella.cemetery.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by mike on 2016-03-24.
 */
public class Sector {
    private LatLng latLng;
    private String name;

    public Sector(String name, LatLng latLng){
        this.name = name;
        this.latLng = latLng;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
