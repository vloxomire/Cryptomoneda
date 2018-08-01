package com.example.itmaster.cryptomoneda;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ListenerBitCointClick implements View.OnClickListener {
    private MainActivity context;
    //en este caso va Activity porque para el toast alcanza
    public ListenerBitCointClick(MainActivity context) {
        this.context = context;
    }



    @Override
    public void onClick(View v) {
       Intent bitcoin = new Intent(context, BitcoinActivity.class);
       //Agrego con putExtra los datos a pasar. Clave de busqueda y valor.
       bitcoin.putExtra("TEXTOTITULO", this.context.getTextCripto().getText());
       bitcoin.putExtra("STRTITULO", this.context.getTextCripto().toString());
       bitcoin.putExtra("DATOFIJO", "Prueba");
       bitcoin.putExtra("DATOFIJONUM", 0);

       context.startActivity(bitcoin);
       //Toast.makeText(context, "Hola", Toast.LENGTH_SHORT).show();

    }
}
