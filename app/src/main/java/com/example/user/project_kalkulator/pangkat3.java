package com.example.user.project_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pangkat3 extends AppCompatActivity {
    private Button btnPangkat3;
    private EditText X;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangkat3);

        btnPangkat3 = findViewById(R.id.btn_pangkat3);
        X = findViewById(R.id.x);
        hasil = findViewById(R.id.tv_pangkat3);

        btnPangkat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());

                    double p3 = Math.pow(p,3) ;

                    hasil.setText(String.valueOf(p3));
                }catch(NumberFormatException nfe) {//nama buat deklarasinya
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
