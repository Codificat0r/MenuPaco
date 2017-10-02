package com.example.menuprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnEjercicio1;
    private Button btnEjercicio2;
    private Button btnEjercicio3;
    private Button btnEjercicio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio1 = (Button)findViewById(R.id.btnEjercicio1);
        btnEjercicio2 = (Button)findViewById(R.id.btnEjercicio2);
        btnEjercicio3 = (Button)findViewById(R.id.btnEjercicio3);
        btnEjercicio4 = (Button)findViewById(R.id.btnEjercicio4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEjercicio1:

                break;
            case R.id.btnEjercicio2:

                break;
            case R.id.btnEjercicio3:

                break;
            case R.id.btnEjercicio4:

                break;
        }
    }
}
