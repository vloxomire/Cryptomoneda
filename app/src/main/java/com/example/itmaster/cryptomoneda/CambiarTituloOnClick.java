package com.example.itmaster.cryptomoneda;

import android.view.View;

public class CambiarTituloOnClick implements View.OnClickListener {
    private MainActivity context;
    //En este caso defino el atributo como mainactivity para llegar a los
    // metodos publicos de la clase MainActivity. Si lo Defino como Activity o
    //Context entro en el principio que el hijo se comporta como el padre y no
    // llego a ver la interfaz definida en mainactivity


    public CambiarTituloOnClick(MainActivity context) {
        this.context = context;
    }


    @Override
    public void onClick(View v) {
      context.getTextCripto().setText("hola mundo!!!");
    }
}
