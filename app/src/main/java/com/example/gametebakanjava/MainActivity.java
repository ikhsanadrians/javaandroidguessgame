package com.example.gametebakanjava;



import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_payungteduh, imageView_panturas, imageView_noah,imageView_erk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {

        imageView_payungteduh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_buah","payungteduh");
                startActivity(d);
            }
        });

        imageView_panturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama_buah","thepanturas");
                startActivity(c);
            }
        });

        imageView_noah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama_buah","noah");
                startActivity(a);
            }
        });

        imageView_erk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_buah","efekrumahkaca");
                startActivity(al);
            }
        });
    }

    private void setInisialisasi() {
        imageView_payungteduh = (ImageView)findViewById(R.id.imageView_payungteduh);
        imageView_panturas = (ImageView)findViewById(R.id.imageView_panturas);
        imageView_noah = (ImageView)findViewById(R.id.imageView_noah);
        imageView_erk = (ImageView)findViewById(R.id.imageView_erk);
    }
}