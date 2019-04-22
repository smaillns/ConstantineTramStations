package com.example.smail.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.SphericalUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;
    private final static String LINE = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";
    private final static String LINE12 = "_g||Eodig@dB`AJLnB`DvFzD";
    private final static String LINE13 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??";
    private final static String LINE14 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ";
    private final static String LINE15 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD";
    private final static String LINE16 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwN";
    private final static String LINE17 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE18 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE19 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE110 = "_g||Eodig@dB`AJLnB`Dd@h@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE23 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??";
    private final static String LINE24 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ";
    private final static String LINE25 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD";
    private final static String LINE26 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwN";
    private final static String LINE27 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE28 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE29 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE210 = "w~{|Es{hg@THVPdCtArCvCf@VbRpIrDVfBN??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE34 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ";
    private final static String LINE35 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD";
    private final static String LINE36 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwN";
    private final static String LINE37 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE38 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE39 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE310 = "gwz|Ewfhg@??lMz@`Dx@`@BXAf@MTKPO`@g@~DoJ`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE45 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD";
    private final static String LINE46 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwN";
    private final static String LINE47 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE48 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE49 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE410 = "ixy|Eaqhg@`@eACc@O_@wVaR_@u@[mACq@@WDYVm@RSf@ShDD~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE56 = "miz|Eerig@~CE\\a@fAiE|AsD`AwN";
    private final static String LINE57 = "miz|Eerig@~CE\\a@fAiE|AsD`AwNNgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE58 = "miz|Eerig@~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE59 = "miz|Eerig@~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE510 = "miz|Eerig@~CE\\a@fAiE|AsD`AwNNgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE67 = "g|y|Ecojg@NgCfCaU`@y@nKmFfD_@xAL|H~B";
    private final static String LINE68 = "g|y|Ecojg@NgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE69 = "g|y|Ecojg@NgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE610 = "g|y|Ecojg@NgCfCaUd@eAjKaFfD_@xAL|H~B`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE78 = "}wx|Egokg@`HhCzCh@bCA~Hy@|MhA";
    private final static String LINE79 = "}wx|Egokg@`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE710 = "}wx|Egokg@`HhCzCh@bCA~Hy@|MhAhDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE89 = "}lw|Eeikg@hDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJ";
    private final static String LINE810 = "}lw|Eeikg@hDZhCYlMgGfG{FjCQ~MmCf@UfFsDz@Q~DJjEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";

    private final static String LINE910 = "{hu|Ewdlg@jEb@??xJxIdBXjHEf@HvI|B~CP??zFUnIo@vIoC";


    private ImageView mImageView;
    private String stationA = "";
    private String stationB = "";
    List<LatLng> decodedPath; // pour afficher le chemin entre les deux stations
    Polyline polyline;
    Marker m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //-----------------------------------------------------------------------ajouter les markeurs
        LatLng Ben_Abdelmalek_Remdane = new LatLng(36.35840, 6.605678);
        m1 = mMap.addMarker(new MarkerOptions().position(Ben_Abdelmalek_Remdane)
                .title("AbdelmalekRemdane "+"lat:36.35840 lng:6.60567")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon))
                );


        LatLng Belle_vue = new LatLng(36.35603, 6.603530);
        m2 = mMap.addMarker(new MarkerOptions()
                                    .position(Belle_vue)
                                    .title("Belle vue | lat:36.35603 lng:6.603530")
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng Kadous_Boumedous = new LatLng(36.35076, 6.600923);
        m3 = mMap.addMarker(new MarkerOptions()
                .position(Kadous_Boumedous)
                .title("Kadous Boumedous  lat:36.35076 lng:6.600923")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));


        LatLng Emir_Abdelkader = new LatLng(36.34581, 6.602566);
        m4 = mMap.addMarker(new MarkerOptions()
                .position(Emir_Abdelkader)
                .title("Emir Abdelkader | lat:36.34581 lng:6.602566")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng Fadhila_saadane = new LatLng(36.34855 , 6.607870 ) ;
        m5 = mMap.addMarker(new MarkerOptions()
                .position(Fadhila_saadane)
                .title("Fadhila saadane | lat:36.34855 lng:6.607870")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng palma = new LatLng(36.346440132518396, 6.61250256);
        m6 = mMap.addMarker(new MarkerOptions()
                .position(palma)
                .title("Station palma | lat:36.3464401 lng:6.6125025")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng Université_Mentourie = new LatLng(36.3406343534305	 , 6.6176366805848374);
        m7 = mMap.addMarker(new MarkerOptions()
                .position(Université_Mentourie)
                .title("Univ Mentourie | lat:36.34063 lng:6.6176")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng Residence_universitaire_Mentourie = new LatLng(36.33375040297903		 , 6.6166704892748385);
        m8 = mMap.addMarker(new MarkerOptions()
                .position(Residence_universitaire_Mentourie)
                .title("R U Mentourie | lat:36.333750 lng:6.616670")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng cité_Kheznadar = new LatLng(36.32286, 6.621075);
        m9 = mMap.addMarker(new MarkerOptions()
                .position(cité_Kheznadar)
                .title("cité Kheznadar | lat:36.32286 lng:6.621075")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        LatLng Zouaghi_slimane = new LatLng(36.31056, 6.619372);
        m10 = mMap.addMarker(new MarkerOptions().position(Zouaghi_slimane).title("Zouaghi slimane | lat:36.31056 lng:6.619372").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.35840, 6.605678), 12));

        //------------------------------------------


        //---------------------------------------dessiner litinéraire complet en vert clair
        List<LatLng> decodedPath2 = PolyUtil.decode(LINE);

        mMap.addPolyline(new PolylineOptions().addAll(decodedPath2)
                .color(0xa798ba00));

        //------------------------------------------


//------------------------------------------- ajouter du contenu aux spinners (comboBox)
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.stations_array, android.R.layout.simple_spinner_item);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                stationA = (String) parentView.getItemAtPosition(position);
                dessinerChemin();
            }


            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here

            }

        });
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                stationB = (String) parentView.getItemAtPosition(position);
                dessinerChemin();

            }


        public void onNothingSelected(AdapterView<?> parentView) {
        // your code here
        }

    });

        //initialisation spinner
        spinner.setSelection(0);
        spinner2.setSelection(9);



        //-----------------------





        final ImageView imageButton = findViewById(R.id.imageView2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ImageView image = new ImageView(MapsActivity.this);
                image.setImageResource(R.drawable.image2);

                AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                builder .setMessage("")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                        })
                        .setView(image);
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        //-----------------------
    }





    private void dessinerChemin() {


        IconGenerator iconFactory = new IconGenerator(this); //l'étiquette qui affiche la distance et le temps estimé
        double vitesseM = 333.33;
        double distance ;
        double timeE;

        switch (stationA){
            case "Ben Abdelmalek Remdane":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        polyline.remove();    //supprimer le chemin precedent
                        m1.showInfoWindow();  //afficher le markeur de la station
                        marker.remove();      //supprimer le marker qui affiche la distance et le temps estimé
                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE12);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35783  	, 6.60528));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE13);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.355243644143464	, 6.60281077009131));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE14);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.355243644143464	, 6.60281077009131));


                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE15);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));


                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE16);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));


                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE17);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34565852969791	, 6.603100448828627));


                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE18);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34565852969791	, 6.603100448828627));


                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE19);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE110);
//                        Log.d("TAG", "dessinerChemin: "+SphericalUtil.computeLength(decodedPath)+"m");

                        if (marker != null)
                                marker.remove();


                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34551038111511	, 6.616995038202731));


                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        break;
                }
                break;
            case "Belle vue":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE12);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35783  	, 6.60528));


                        break;
                    case "Belle vue":

                        polyline.remove();
                        m2.showInfoWindow();
                        marker.remove();
                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE23);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35217710905108 , 6.601121723942924));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE24);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35217710905108 , 6.601121723942924));


                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE25);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));


                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE26);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));



                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE27);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));


                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE28);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE29);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE210);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                }
                break;



            case "Kadous Boumedous":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE13);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.355243644143464	, 6.60281077009131));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE23);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35217710905108 , 6.601121723942924));

                        break;
                    case "Kadous Boumedous":
                        polyline.remove();
                        marker.remove();
                        m3.showInfoWindow();
                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE34);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));


                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE35);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));


                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE36);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));


                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE37);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE38);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));


                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE39);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE310);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                }
                break;

            case "Emir Abdelkader":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE14);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.355243644143464	, 6.60281077009131));
                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE24);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.35217710905108 , 6.601121723942924));
                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE34);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));


                        break;
                    case "Emir Abdelkader":
                        polyline.remove();
                        marker.remove();
                        m4.showInfoWindow();
                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE45);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));


                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE46);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE47);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE48);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));


                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE49);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE410);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                }
                break;

            case "Fadhila saadane":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE15);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE25);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE35);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE45);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));


                        break;
                    case "Fadhila saadane":

                        polyline.remove();
                        m5.showInfoWindow();
                        marker.remove();
                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE56);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34723776822736	, 6.60908043382733));


                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE57);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));


                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE58);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE59);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE510);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.3278807137214	, 6.619329154432307 ));

                        break;
                }
                break;

            case "Station palma":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE16);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));
                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE26);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE36);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34746607666748	, 6.60031139846069));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE46);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE56);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34723776822736	, 6.60908043382733));

                        break;
                    case "Station palma":

                        polyline.remove();
                        m6.showInfoWindow();
                        marker.remove();

                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE67);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(336.34551038111511	, 6.616995038202731));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE68);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(336.34551038111511	, 6.616995038202731));

                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE69);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.33773588317994	, 6.616747380467132));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE610);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.3278807137214	, 6.619329154432307));

                        break;
                }
                break;

            case "Université Mentourie":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE17);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34565852969791	, 6.603100448828627));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE27);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.347642145146715	, 6.600332856132809));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE37);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE47);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE57);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE67);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));
                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(336.34551038111511	, 6.616995038202731));

                        break;
                    case "Université Mentourie":

                        polyline.remove();
                        m7.showInfoWindow();
                        marker.remove();
                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE78);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.338401351857044	, 6.616736651631072));


                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE79);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE710);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                }
                break;

            case "Residence universitaire Mentourie":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE18);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34565852969791	, 6.603100448828627));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE28);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE38);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE48);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE58);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE68);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(336.34551038111511	, 6.616995038202731));

                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE78);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.338401351857044	, 6.616736651631072));

                        break;
                    case "Residence universitaire Mentourie":

                        polyline.remove();
                        m8.showInfoWindow();
                        marker.remove();
                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE89);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE810);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                }
                break;

            case "cité Kheznadar":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE19);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE29);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE39);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.349697297340875	, 6.606584638502682));

                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE49);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE59);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE69);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.33773588317994	, 6.616747380467132));

                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE79);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE89);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "cité Kheznadar":

                        polyline.remove();
                        m9.showInfoWindow();
                        marker.remove();
                        break;
                    case "Zouaghi slimane":
                        decodedPath = PolyUtil.decode(LINE910);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.31793839674272	, 6.619067192004877));

                        break;
                }
                break;

            case "Zouaghi slimane":
                switch (stationB){
                    case "Ben Abdelmalek Remdane":
                        decodedPath = PolyUtil.decode(LINE);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        if (marker != null)
                            marker.remove();


                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34551038111511	, 6.616995038202731));

                        break;
                    case "Belle vue":

                        decodedPath = PolyUtil.decode(LINE210);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Kadous Boumedous":
                        decodedPath = PolyUtil.decode(LINE310);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));


                        break;
                    case "Emir Abdelkader":
                        decodedPath = PolyUtil.decode(LINE410);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.34351197979218	, 6.6181939843227156));

                        break;
                    case "Fadhila saadane":
                        decodedPath = PolyUtil.decode(LINE510);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.3278807137214	, 6.619329154432307 ));

                        break;
                    case "Station palma":
                        decodedPath = PolyUtil.decode(LINE610);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.3278807137214	, 6.619329154432307));

                        break;
                    case "Université Mentourie":
                        decodedPath = PolyUtil.decode(LINE710);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "Residence universitaire Mentourie":
                        decodedPath = PolyUtil.decode(LINE810);

                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.328580840590696	, 6.619237959366728));

                        break;
                    case "cité Kheznadar":
                        decodedPath = PolyUtil.decode(LINE910);
                        polyline.remove();
                        polyline = mMap.addPolyline(new PolylineOptions().addAll(decodedPath)
                                .color(0xff0000ff));

                        marker.remove();
                        distance = BigDecimal.valueOf(SphericalUtil.computeLength(decodedPath)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                        timeE = BigDecimal.valueOf (distance / vitesseM).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        addIcon(iconFactory, ""+ distance +" m \n  "+ timeE +" min", new LatLng(36.31793839674272	, 6.619067192004877));

                        break;
                    case "Zouaghi slimane":
                        polyline.remove();
                        m10.showInfoWindow();
                        marker.remove();
                        break;
                }
                break;

        }
    }



    private void addIcon(IconGenerator iconFactory, CharSequence text, LatLng position) {
        MarkerOptions markerOptions = new MarkerOptions().
                icon(BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon(text))).
                position(position).
                anchor(iconFactory.getAnchorU(), iconFactory.getAnchorV());

        marker = mMap.addMarker(markerOptions);
    }
}
