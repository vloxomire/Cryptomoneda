package com.example.itmaster.cryptomoneda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BitcoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoin);


    }

    public void Calcular(View view) {
       double cotizacion = 22000;
       EditText pesos = findViewById(R.id.pesos);
       double valorPesos = Double.valueOf(pesos.getText().toString());
       double valorBitcoins = valorPesos/cotizacion;
       valorBitcoins =((int) valorBitcoins*10)/10;
       String mensaje ="Podes comprar" + valorBitcoins + "bitcoins";

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
