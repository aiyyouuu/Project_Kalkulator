package com.example.user.project_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pangkat2 extends AppCompatActivity {
    private Button btnPangkat2;
    private EditText X;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangkat2);

        btnPangkat2 = findViewById(R.id.btn_pangkat2);
        X = findViewById(R.id.x);
        hasil = findViewById(R.id.tv_pangkat2);

        btnPangkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());

                    double p2 = Math.pow(p,2) ;

                    hasil.setText(String.valueOf(p2));
                }catch(NumberFormatException nfe) {//nama buat deklarasinya
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
