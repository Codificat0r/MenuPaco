package com.example.menuprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnEjercicio1;
    private Button btnEjercicio2;
    private Button btnEjercicio3;
    private Button btnEjercicio4;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio1 = (Button)findViewById(R.id.btnEjercicio1);
        btnEjercicio2 = (Button)findViewById(R.id.btnEjercicio2);
        btnEjercicio3 = (Button)findViewById(R.id.btnEjercicio3);
        btnEjercicio4 = (Button)findViewById(R.id.btnEjercicio4);

        btnEjercicio1.setOnClickListener(this);
        btnEjercicio2.setOnClickListener(this);
        btnEjercicio3.setOnClickListener(this);
        btnEjercicio4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEjercicio1:
                intent = new Intent(this, ConversorActivity.class);
                startActivity(intent);
                break;
            case R.id.btnEjercicio2:
                intent = new Intent(this, PaginaWebActivity.class);
                startActivity(intent);
                break;
            case R.id.btnEjercicio3:
                intent = new Intent(this, ContadorCafesActivity.class);
                startActivity(intent);
                break;
            case R.id.btnEjercicio4:
                intent = new Intent(this, EsBisiestoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
