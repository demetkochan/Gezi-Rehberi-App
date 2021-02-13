package com.example.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class CityDetail extends AppCompatActivity {
    final List<CityModel> citylist = new ArrayList<CityModel>();
    private List<CityModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);


        Button site = (Button)findViewById(R.id.site);
        ImageView şehir_resim = (ImageView) findViewById(R.id.şehir_resim);
        TextView şehir_adı = (TextView) findViewById(R.id.şehir_adı);
        TextView acıklama = (TextView) findViewById(R.id.acıklama);
        VideoView video = (VideoView) findViewById(R.id.video);
        ImageView geri = (ImageView) findViewById(R.id.geri);
        GridView image_gallery = (GridView)findViewById(R.id.gridview);

        Intent intent=getIntent();
        String selectedCity=intent.getStringExtra("city");
        String selectedDescription = intent.getStringExtra("description");
        int selectedImage = intent.getIntExtra("image",0);



        image_gallery.setAdapter(new ImageAdapter(this));
        şehir_adı.setText(selectedCity);
        acıklama.setText(selectedDescription);
        şehir_resim.setImageResource(selectedImage);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.gezirehberi;

        Uri uri = Uri.parse(videoPath);
        video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);



        ((ScrollView) findViewById(R.id.scrollView)).post(new Runnable() {
            public void run() {
                ((ScrollView) findViewById(R.id.scrollView)).fullScroll(View.FOCUS_UP);
            }
        });

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        image_gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showMyCustomAlertDialog();


            }
        });
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CityDetail.this, ActivitySite.class);
                Toast.makeText(CityDetail.this,"SAYFA YÜKLENİYOR",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }

    public void onBackPressed(){
        super.onBackPressed();
    }

    public void showMyCustomAlertDialog(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);

        Button btnKaydet = (Button) dialog.findViewById(R.id.button_kaydet);
        Button btnIptal = (Button) dialog.findViewById(R.id.button_iptal);
        ImageView popup_resim = (ImageView) dialog.findViewById(R.id.popup_resim);

        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CityDetail.this , "Kaydetme İşlemi Başarılı", Toast.LENGTH_SHORT).show();
            }
        });
        btnIptal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about_us) {
            Toast.makeText(this, "Hakkımızda Tıklandı", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, About_Us.class);
            startActivity(intent);
        }
        else if(id == R.id.exit){
            Toast.makeText(this,"Çıkışa Tıklandı",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder builder = new AlertDialog.Builder(CityDetail.this);
            builder.setMessage("Çıkmak İstediğinizden Emin Misiniz?")
                    .setCancelable(false)
                    .setPositiveButton("EVET", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent setIntent = new Intent(CityDetail.this, MainActivity.class);
                            setIntent.addCategory(Intent.CATEGORY_HOME);
                            setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(setIntent);
                        }
                    })
                    .setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onOptionsItemSelected(item);

    }

}


