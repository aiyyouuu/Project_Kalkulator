package com.example.user.project_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persen extends AppCompatActivity {
    private Button btnPersen;
    private EditText X;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persen);

        btnPersen = findViewById(R.id.btn_persen);
        X = findViewById(R.id.x);
        hasil = findViewById(R.id.tv_persen);

        btnPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());

                    double persen = p / 100 ;

                    hasil.setText(String.valueOf(persen));
                }catch(NumberFormatException nfe) {//nama buat deklarasinya
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
