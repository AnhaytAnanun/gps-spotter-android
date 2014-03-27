package tvo.development.gps_spotter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends Activity {
	
	GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		// Gets the MapView from the XML layout and creates it
//		MapView mapView = (MapView) findViewById(R.id.mapview);
//		mapView.onCreate(savedInstanceState);
// 
//		// Gets to GoogleMap from the MapView and does initialization stuff
//		googleMap = mapView.getMap();
//		googleMap.getUiSettings().setMyLocationButtonEnabled(false);
//		googleMap.setMyLocationEnabled(true);
// 
//		// Needs to call MapsInitializer before doing any CameraUpdateFactory calls
//		try {
//			MapsInitializer.initialize(this);
//		} catch (GooglePlayServicesNotAvailableException e) {
//			e.printStackTrace();
//		}
//		
//		// Updates the location and zoom of the MapView
//		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(43.1, -87.9), 10);
//		googleMap.animateCamera(cameraUpdate);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
