package com.example.itmaster.cryptomoneda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boton1, boton2;
    private ListenerBitCointClick listenerBitCointClick;
    private ListenerBitCointLongClick listenerBitCointLongClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        listenerBitCointClick = new ListenerBitCointClick(this);
        listenerBitCointLongClick = new ListenerBitCointLongClick(this);
        boton1.setOnClickListener(listenerBitCointClick);
        boton1.setOnLongClickListener(listenerBitCointLongClick);
    }

}
