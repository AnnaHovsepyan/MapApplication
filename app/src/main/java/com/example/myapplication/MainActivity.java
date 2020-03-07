package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;


public class MainActivity extends BaseGoogleMapsActivity {

    private ClusterManager<Person> mClusterManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        setupMap(googleMap);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(40.175079, 44.512321), 12));

        mClusterManager = new ClusterManager<>(this, googleMap);

        googleMap.setOnCameraIdleListener(mClusterManager);
        googleMap.setOnMarkerClickListener(mClusterManager);
        googleMap.setOnInfoWindowClickListener(mClusterManager);
        addPersonItems();
        mClusterManager.cluster();

    }

    private void addPersonItems() {
        for (int i = 0; i < 3; i++) {
            mClusterManager.addItem(new Person(40.175079, 44.512321, "«Մհեր Մկրտչյան» Արտիստական թատրոն"));
            mClusterManager.addItem(new Person(40.184216, 44.522846, "Պատանի Հանդիսատեսի Թատրոն"));
            mClusterManager.addItem(new Person(40.188757, 44.519781, "Երևանի Հրաչյա Ղափլանյանի Անվան Դրամատիկ Թատրոն"));
            mClusterManager.addItem(new Person(40.190042, 44.523444, "Հայաստանի ազգային գրադարան"));
            mClusterManager.addItem(new Person(40.192977, 44.509048, "ՀՀ ԳԱԱ Հիմնարար գիտական գրադարան"));
            mClusterManager.addItem(new Person(40.178164, 44.516203, "Ավետիք Իսահակյանի անվան կենտրոնական գրադարան"));

            mClusterManager.addItem(new Person(40.184054, 44.516905, "Խնկո-Ապոր գրադարան"));
            mClusterManager.addItem(new Person(40.191748, 44.510422, "Ավետիք Իսահակյանի անվան կենտրոնական գրադարանի №21 մասնաճյուղ"));
            mClusterManager.addItem(new Person(40.193108, 44.504328, "ՀԲԸՄ Փափազյան գրադարան"));
            mClusterManager.addItem(new Person(40.204651, 44.513312, "Ավետիք Իսահակյանի անվան կենտրոնական գրադարանի №36 մասնաճյուղ"));


            mClusterManager.addItem(new Person(40.200335, 44.493364, "Ավետիք Իսահակյանի անվան կենտրոնական գրադարանի №36 մասնաճյուղ"));
            mClusterManager.addItem(new Person(40.202198, 44.543275, "Քանաքեռ-Զեյթուն Կենտրոնական գրադարանային համալիր"));
            mClusterManager.addItem(new Person(40.174925, 44.512282, "Միրզոյան գրադարան"));

            mClusterManager.addItem(new Person(40.141233, 44.535224, "Էրեբունի պատմահնագիտական արգելոց-թանգարան"));
            mClusterManager.addItem(new Person(40.178670, 44.513837, "Հայաստանի պատմության Թանգարան"));
            mClusterManager.addItem(new Person(40.180059, 44.505864, "Ժամանակակից արվեստի թանգարան"));
            mClusterManager.addItem(new Person(40.185152, 44.510314, "Կարեն Դեմիրճյանի թանգարան"));
            mClusterManager.addItem(new Person(40.178763, 44.514073, "Հայաստանի Ազգային Պատկերասրահ"));

        }
    }

  
}




