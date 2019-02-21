package com.example.user.project_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sudut extends AppCompatActivity implements View.OnClickListener {
    private Button btnSin, btnCos, btnTan, btnCsc, btnSec, btnCot;
    private TextView hasil;
    private EditText X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudut);

        hasil = findViewById(R.id.tv_sudut);
        X = findViewById(R.id.x);
        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double a = Double.parseDouble(X.getText().toString());
        double sudut = 0;
        try{
            switch (v.getId()){
                case R.id.btn_sin:
                    sudut = Math.sin(a);
                    break;
                case R.id.btn_cos:
                    sudut = Math.cos(a);
                    break;
                case R.id.btn_tan:
                    sudut = Math.tan(a);
                    break;
            }
            hasil.setText(String.valueOf(sudut));
        } catch (Exception e){
            Toast.makeText(getApplicationContext(), "Data Kurang" , Toast.LENGTH_SHORT).show();
        }
    }
}
