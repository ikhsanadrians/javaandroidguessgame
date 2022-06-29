package com.example.gametebakanjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tiban;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);


        setInitalisasi();
        cekIntent();
        onClickJos();
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)) {
                    Toast.makeText(TebakActivity.this, "Yee Benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this, "oo Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_buah = cek.getStringExtra("nama_buah");

        if (nama_buah.equals("payungteduh")) {
            imageView_tiban.setImageResource(R.drawable.payungteduh);
            jawaban = "Payung Teduh";

        } else if (nama_buah.equals("thepanturas")) {
            imageView_tiban.setImageResource(R.drawable.panturas);
            jawaban = "The Panturas" ;
        } else if (nama_buah.equals("noah")) {
            imageView_tiban.setImageResource(R.drawable.noah);
            jawaban = "Noah";
        } else {
            imageView_tiban.setImageResource(R.drawable.erk);
            jawaban = "Efek Rumah Kaca";
        }

    }

    private void setInitalisasi() {
        imageView_tiban = (ImageView) findViewById(R.id.imageView_tiban);
        editText_jawabb = (EditText) findViewById(R.id.editText_jawab);
        button_cek = (Button) findViewById(R.id.buttonCek);
    }
}