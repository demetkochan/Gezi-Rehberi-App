package com.example.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] images = {R.drawable.londra1,R.drawable.paris1,R.drawable.tokyo1,R.drawable.roma1,R.drawable.valencia1,R.drawable.bristol1,R.drawable.marsilya1,R.drawable.keflavik1,R.drawable.koln1,R.drawable.madrid1,R.drawable.meksiko1,R.drawable.sevilla1};
    private int position;


    public ImageAdapter(Context c){
        mContext = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(250,250));
        return imageView;


    }
}
