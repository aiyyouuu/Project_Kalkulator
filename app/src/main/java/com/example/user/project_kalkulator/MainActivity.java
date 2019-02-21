package com.example.user.project_kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.user.project_kalkulator.R;

public class MainActivity extends AppCompatActivity {
    private Button tambah, kurang, bagi, kali, pangkat2, pangkat3, persen, sudut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = findViewById(R.id.btn_jumlah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), penjumlahan.class);
                startActivity(intent);
            }
        });
        kurang = findViewById(R.id.btn_kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pengurangan.class);
                startActivity(intent);
            }
        });
        bagi = findViewById(R.id.btn_bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pembagian.class);
                startActivity(intent);
            }
        });
        kali = findViewById(R.id.btn_kali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), perkalian.class);
                startActivity(intent);
            }
        });
        pangkat2 = findViewById(R.id.btn_pangkat2);
        pangkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pangkat2.class);
                startActivity(intent);
            }
        });
        pangkat3 = findViewById(R.id.btn_pangkat3);
        pangkat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pangkat3.class);
                startActivity(intent);
            }
        });
        persen = findViewById(R.id.btn_persen);
        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), persen.class);
                startActivity(intent);
            }
        });
        sudut = findViewById(R.id.btn_sudut);
        sudut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sudut.class);
                startActivity(intent);
            }
        });
    }

}
