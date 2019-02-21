package com.example.user.project_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.project_kalkulator.R;

public class penjumlahan extends AppCompatActivity {
    private Button btnTambah;
    private EditText X,Y;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);

        btnTambah = findViewById(R.id.btn_tambah);
        X = findViewById(R.id.x);
        Y = findViewById(R.id.y);
        hasil = findViewById(R.id.tv_tambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());
                    double l = Double.parseDouble(Y.getText().toString());

                    double plus = p + l;

                    hasil.setText(String.valueOf(plus));
                }catch(NumberFormatException nfe) {//nama buat deklarasinya
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
