package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends BaseAdapter {
    private LayoutInflater userInflater;
    private List<CityModel> list;


    public CustomAdapter(Activity activity, List<CityModel> list) {
        userInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View lineView;
        lineView = userInflater.inflate(R.layout.customer, null);
        TextView sehir_isim = (TextView) lineView.findViewById(R.id.sehir_isim);
        ImageView sehir_resim = (ImageView) lineView.findViewById(R.id.img);
        TextView  desc = (TextView) lineView.findViewById(R.id.desc);




        CityModel city = list.get(i);
        sehir_isim.setText(city.getName());
        sehir_resim.setImageResource( city.getImage());
        desc.setText(city.getDecription());




        return lineView;
    }
}
