package com.example.menuprincipal;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EsBisiestoActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtAnio;
    private Button btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAnio = (EditText)findViewById(R.id.edtAnio);
        btnComprobar = (Button)findViewById(R.id.btnComprobar);
        btnComprobar.setOnClickListener(this);
    }

    private static boolean esBisiesto(int año)
    {

        if (año % 4 == 0 && !(año % 100 == 0))
            return true;
        if (año % 400 == 0)
            return true;
        return false;
    }

    @Override
    public void onClick(View v) {
        if (v == btnComprobar) {
            AlertDialog.Builder popup=new AlertDialog.Builder(this);
            try {
                if (esBisiesto(Integer.parseInt(edtAnio.getText().toString()))) {
                    popup.setTitle("¿Bisiesto?");
                    popup.setMessage("El año es bisiesto");
                    popup.setPositiveButton("De acuerdo", null);
                    popup.show();
                } else {
                    popup.setTitle("¿Bisiesto?");
                    popup.setMessage("El año es no bisiesto");
                    popup.setPositiveButton("De acuerdo", null);
                    popup.show();
                }
            } catch (Exception e) {
                Toast.makeText(this, "Debe introducir un valor válido", Toast.LENGTH_LONG).show();
            }
        }
    }
}
