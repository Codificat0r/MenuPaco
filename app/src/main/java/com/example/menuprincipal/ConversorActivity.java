package com.example.menuprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ConversorActivity extends AppCompatActivity implements View.OnClickListener{

    //Creamos objetos para guardar la direccion de memoria de los ya creados y poder trabajar con
    //ellos
    Button btnConvertir;
    RadioButton rbtnDolarEuro;
    RadioButton rbtnEuroDolar;
    EditText edtxtDolar;
    EditText edtxtEuro;
    EditText edtxtConversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        edtxtEuro = (EditText)findViewById(R.id.edtxtEuro);
        edtxtDolar = (EditText)findViewById(R.id.edtxtDolar);
        edtxtConversion = (EditText)findViewById(R.id.edtxtConversion);
        rbtnDolarEuro = (RadioButton)findViewById(R.id.rbtnDolarEuro);
        rbtnEuroDolar = (RadioButton)findViewById(R.id.rbtnEuroDolar);
        btnConvertir = (Button)findViewById(R.id.btnConvertir);

        btnConvertir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btnConvertir)
        {
            try {
                if (rbtnDolarEuro.isChecked()) {
                    edtxtEuro.setText(Double.toString(Double.parseDouble(edtxtDolar.getText().toString()) * Double.parseDouble(edtxtConversion.getText().toString())));
                }
                if (rbtnEuroDolar.isChecked()) {
                    edtxtDolar.setText(Double.toString(Double.parseDouble(edtxtEuro.getText().toString()) / Double.parseDouble(edtxtConversion.getText().toString())));
                }
            }
            catch (Exception e) {
                Toast.makeText(this, "Error en el formato de los números introducidos", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
