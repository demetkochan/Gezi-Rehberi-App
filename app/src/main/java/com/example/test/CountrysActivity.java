package com.example.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.concurrent.locks.ReadWriteLock;

public class CountrysActivity extends AppCompatActivity {
    ListView liste;
    RelativeLayout almanya, amerika, brezilya,fransa,ingiltere,ispanya,izlanda,japonya,meksika,italya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        almanya = (RelativeLayout) findViewById(R.id.almanya);
        amerika = (RelativeLayout) findViewById(R.id.amerika);
        brezilya = (RelativeLayout) findViewById(R.id.brezilya);
        fransa = (RelativeLayout) findViewById(R.id.fransa);
        ingiltere = (RelativeLayout) findViewById(R.id.ingiltere);
        ispanya = (RelativeLayout) findViewById(R.id.ispanya);
        izlanda = (RelativeLayout) findViewById(R.id.izlanda);
        japonya = (RelativeLayout) findViewById(R.id.japonya);
        meksika = (RelativeLayout) findViewById(R.id.meksika);
        italya = (RelativeLayout) findViewById(R.id.italya);

        almanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("almanya");
            }
        });
        amerika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("amerika");
            }
        });
        brezilya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("brezilya");
            }
        });
        fransa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("fransa");
            }
        });
        ingiltere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("ingiltere");
            }
        });
        ispanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("ispanya");
            }
        });
        izlanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("izlanda");
            }
        });
        japonya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("japonya");
            }
        });
        meksika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("meksika");
            }
        });
        italya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CitiesActivity("italya");
            }
        });

    }
    public void CitiesActivity(String country){
        Intent intent = new Intent(this, CitiesActivity.class);
        intent.putExtra("country",country);
        startActivity(intent);



    }





}
