package com.example.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText kullanıcıAdı , sifre ;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        kullanıcıAdı = (EditText) findViewById(R.id.editText2);
        sifre = (EditText) findViewById(R.id.editText3);
        btn = (Button) findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kullanıcıAdı.getText().toString().equals("demet")&& sifre.getText().toString().equals("kochan")){

                }
                else if(kullanıcıAdı.getText().toString().equals("demet")&&  !sifre.getText().toString().equals("kochan")){
                    Toast.makeText(MainActivity.this , "Şifre Hatalı", Toast.LENGTH_LONG).show();
                }
                else if(!kullanıcıAdı.getText().toString().equals("demet")&& sifre.getText().toString().equals("kochan")){
                    Toast.makeText(MainActivity.this , "Kullanıcı Adı Hatalı", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this , "Kullanıcı Adı ve Şifre Hatalı", Toast.LENGTH_LONG).show();
                }
                CountrysActivity();

            }

        });

            }


    public void CountrysActivity() {
        if(kullanıcıAdı.getText().toString().equals("demet")&& sifre.getText().toString().equals("kochan")) {


            Intent intent = new Intent(this, CountrysActivity.class);
            startActivity(intent);
        }

    }






}
