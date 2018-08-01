package com.example.itmaster.cryptomoneda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BitcoinActivity extends AppCompatActivity {
    private EditText pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoin);
       //Creo la bolsa para poder obtener los datos pasados entre activities
        Bundle b = new Bundle();
        //guardo en la bolsa los datos pasados por el intent que disparo el activity
        b = getIntent().getExtras();
        ///levando dato a dato, buscandolo por mismos nombre
        String dato = b.getString("TEXTOTITULO");
        String dato2 = b.getString("STRTITULO");
        String dato3 = b.getString("DATOFIJO");
        Integer dato4 = b.getInt("DATOFIJONUM");

        pesos = findViewById(R.id.pesos);
        pesos.setText(dato3 + " " + dato2);





    }

    public void Calcular(View view) {
       double cotizacion = 22000;

       double valorPesos = Double.valueOf(pesos.getText().toString());
       double valorBitcoins = valorPesos/cotizacion;
       valorBitcoins =((int) valorBitcoins*10)/10;
       String mensaje ="Podes comprar" + valorBitcoins + "bitcoins";

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
