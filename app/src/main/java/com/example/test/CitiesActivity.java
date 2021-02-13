package com.example.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class CitiesActivity extends AppCompatActivity {

    final List<CityModel> citylist = new ArrayList<CityModel>();

    ImageView resim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent=getIntent();
        String selectedCountry=intent.getStringExtra("country");



        if(selectedCountry.equals("almanya")) {
            citylist.add(new CityModel("BERLİN", R.drawable.berlin,getString(R.string.berlin) ));
            citylist.add(new CityModel("KÖLN", R.drawable.koln,getString(R.string.köln)));
            citylist.add(new CityModel("FRANKFURT", R.drawable.frankfurt,getString(R.string.frankfurt)));
            citylist.add(new CityModel("HANNOVER", R.drawable.hannover,getString(R.string.hannover)));
            citylist.add(new CityModel("MÜNİH", R.drawable.munih,getString(R.string.munih)));
            citylist.add(new CityModel("HAMBURG", R.drawable.hamburg,getString(R.string.hamburg)));
            citylist.add(new CityModel("BREMEN", R.drawable.bremen,getString(R.string.bremen)));
        }
        else if(selectedCountry.equals("amerika")) {
            citylist.add(new CityModel("NEW YORK", R.drawable.newyork,getString(R.string.newyork)));
            citylist.add(new CityModel("VEGAS", R.drawable.vegas,getString(R.string.vegas)));
            citylist.add(new CityModel("MİAMİ", R.drawable.miami,getString(R.string.miami)));
            citylist.add(new CityModel("WASHİNGTON", R.drawable.washington,getString(R.string.washington)));
            citylist.add(new CityModel("SAN FRANCİSCO", R.drawable.francisco,getString(R.string.sanfrancisco)));
            citylist.add(new CityModel("LOS ANGELES", R.drawable.losangeles,getString(R.string.losangeles)));
            citylist.add(new CityModel("SEATLE", R.drawable.seatle,getString(R.string.seatle)));
        }
        else if (selectedCountry.equals("brezilya")) {
            citylist.add(new CityModel("RİO", R.drawable.rio,getString(R.string.rio)));
            citylist.add(new CityModel("SALVADOR", R.drawable.salvador,getString(R.string.salvador)));
            citylist.add(new CityModel("SAO PAULO", R.drawable.sao,getString(R.string.sao)));
            citylist.add(new CityModel("MANAUS", R.drawable.manaus,getString(R.string.manaus)));
            citylist.add(new CityModel("RECİFE", R.drawable.recife,getString(R.string.recife)));
            citylist.add(new CityModel("BELEM", R.drawable.belem,getString(R.string.belem)));
            citylist.add(new CityModel("PORTO ALEGRE", R.drawable.porto,getString(R.string.porto)));
        }
        else if(selectedCountry.equals("fransa")) {
            citylist.add(new CityModel("PARİS", R.drawable.paris,getString(R.string.paris)));
            citylist.add(new CityModel("NİCE", R.drawable.nice,getString(R.string.nice)));
            citylist.add(new CityModel("MARSİLYA", R.drawable.marsilya,getString(R.string.marsilya)));
            citylist.add(new CityModel("LYON", R.drawable.lyon,getString(R.string.lyon)));
            citylist.add(new CityModel("LİLLE", R.drawable.lille,getString(R.string.lille)));
            citylist.add(new CityModel("BORDEAUX", R.drawable.bordeux,getString(R.string.bordeaux)));
            citylist.add(new CityModel("TOULOUSE", R.drawable.toulouse,getString(R.string.toulouse)));
        }
        else if(selectedCountry.equals("ingiltere")) {
            citylist.add(new CityModel("LONDRA", R.drawable.londro,getString(R.string.londra)));
            citylist.add(new CityModel("LİVERPOOL", R.drawable.liverpool,getString(R.string.liverpool)));
            citylist.add(new CityModel("BRİSTOL", R.drawable.bristol,getString(R.string.bristol)));
            citylist.add(new CityModel("OXFORD", R.drawable.oxford,getString(R.string.oxford)));
            citylist.add(new CityModel("YORK", R.drawable.york,getString(R.string.york)));
            citylist.add(new CityModel("BATH", R.drawable.bath,getString(R.string.bath)));
            citylist.add(new CityModel("MANCHESTER", R.drawable.manc,getString(R.string.manc)));
        }
        else if(selectedCountry.equals("ispanya")) {
            citylist.add(new CityModel("BARCELONA", R.drawable.barcelona,getString(R.string.barcelona)));
            citylist.add(new CityModel("MADRİD", R.drawable.madrid,getString(R.string.madrid)));
            citylist.add(new CityModel("VALENCİA", R.drawable.valencia,getString(R.string.valencia)));
            citylist.add(new CityModel("MALAGA", R.drawable.malaga,getString(R.string.malaga)));
            citylist.add(new CityModel("SEVİLLA", R.drawable.sevilla,getString(R.string.sevilla)));
            citylist.add(new CityModel("GRANADA", R.drawable.granada,getString(R.string.granada)));
            citylist.add(new CityModel("CORDOBA", R.drawable.cordoba,getString(R.string.cordoba)));
        }
        else if(selectedCountry.equals("izlanda")) {
            citylist.add(new CityModel("REYKJAVİK", R.drawable.rejhavik,getString(R.string.reykjavik)));
            citylist.add(new CityModel("KEFLAVİK", R.drawable.keflavik,getString(R.string.keflavik)));
            citylist.add(new CityModel("AKUREYRİ", R.drawable.akureyhi,getString(R.string.akureyri)));
            citylist.add(new CityModel("GRİNDAVİK", R.drawable.grindavik,getString(R.string.grindavik)));
            citylist.add(new CityModel("SELFOSS", R.drawable.selfoos,getString(R.string.selfoos)));
            citylist.add(new CityModel("AKRANES", R.drawable.akranes,getString(R.string.akranes)));
            citylist.add(new CityModel("HÖFN", R.drawable.hofn,getString(R.string.höfn)));
        }
        else if(selectedCountry.equals("japonya")) {
            citylist.add(new CityModel("TOKYO", R.drawable.tokyo,getString(R.string.tokyo)));
            citylist.add(new CityModel("OSAKA", R.drawable.osaka,getString(R.string.osaka)));
            citylist.add(new CityModel("KYOTO", R.drawable.kyoto,getString(R.string.kyoto)));
            citylist.add(new CityModel("NARA", R.drawable.nara,getString(R.string.nara)));
            citylist.add(new CityModel("NİKKO", R.drawable.nikko,getString(R.string.nikko)));
            citylist.add(new CityModel("KOBE", R.drawable.kobe,getString(R.string.kobe)));
            citylist.add(new CityModel("HAKONE", R.drawable.hakone,getString(R.string.hakone)));
        }
        else if(selectedCountry.equals("italya")) {
            citylist.add(new CityModel("ROMA", R.drawable.roma,getString(R.string.roma)));
            citylist.add(new CityModel("MİLANO", R.drawable.milano,getString(R.string.milano)));
            citylist.add(new CityModel("VENEDİK", R.drawable.venedik,getString(R.string.venedik)));
            citylist.add(new CityModel("NAPOLİ", R.drawable.napoli,getString(R.string.napoli)));
            citylist.add(new CityModel("FLORANSA", R.drawable.floransa,getString(R.string.floransa)));
            citylist.add(new CityModel("PİSA", R.drawable.pisa,getString(R.string.pisa)));
            citylist.add(new CityModel("VERONA", R.drawable.verona,getString(R.string.verona)));
        }
        else{
            citylist.add(new CityModel("MEKSİKO", R.drawable.meksiko,getString(R.string.meksiko)));
            citylist.add(new CityModel("ITZA", R.drawable.itza,getString(R.string.itza)));
            citylist.add(new CityModel("TEOTİHUACAN", R.drawable.teotihuacan,getString(R.string.teotihuacan)));
            citylist.add(new CityModel("CUERNAVA", R.drawable.cuernava,getString(R.string.cuernava)));
            citylist.add(new CityModel("TOLUCA", R.drawable.toluca,getString(R.string.toluca)));
            citylist.add(new CityModel("ZAPOPAN", R.drawable.zapopan,getString(R.string.zapopan)));
            citylist.add(new CityModel("MAZATLAN", R.drawable.mazatlan,getString(R.string.mazatlan)));
        }


        final ListView listView = (ListView) findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, citylist);
        listView.setAdapter(adapter);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent (CitiesActivity.this, CityDetail.class);
                intent.putExtra("city",citylist.get(i).getName());
                intent.putExtra("image",citylist.get(i).getImage());
                intent.putExtra("description",citylist.get(i).getDecription());
                startActivity(intent);

            }

        });






    }
}

