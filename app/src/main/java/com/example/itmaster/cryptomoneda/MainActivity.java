package com.example.itmaster.cryptomoneda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton1, boton2, boton3;
    private TextView textCripto;
    private ListenerBitCointClick listenerBitCointClick;
    private ListenerBitCointLongClick listenerBitCointLongClick;
    private CambiarTituloOnClick cambiarTituloOnClick;

    public TextView getTextCripto() {
        return textCripto;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCripto = findViewById(R.id.textoCripto);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.cambiarTitulo);
        // a los listener les paso mediante el constructor esta misma clase, por si
        // necesitas utilizar metodos publicos "interfaz" de esta clase.
        cambiarTituloOnClick = new CambiarTituloOnClick(this);
        listenerBitCointClick = new ListenerBitCointClick(this);
        listenerBitCointLongClick = new ListenerBitCointLongClick(this);
        //suscribo los botones a sus respectivos escuchadores, para que se
        // ejecute el onclick definido para cada uno
        boton3.setOnClickListener(cambiarTituloOnClick);
        //al boton1 se le definio un longclik y un click.
        boton1.setOnClickListener(listenerBitCointClick);
        boton1.setOnLongClickListener(listenerBitCointLongClick);
    }

}
