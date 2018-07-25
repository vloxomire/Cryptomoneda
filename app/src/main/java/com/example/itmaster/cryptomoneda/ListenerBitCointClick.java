package com.example.itmaster.cryptomoneda;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ListenerBitCointClick implements View.OnClickListener {
    private Activity context;

    public ListenerBitCointClick(Activity context) {
        this.context = context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
       Intent bitcoin = new Intent(context, BitcoinActivity.class);
       context.startActivity(bitcoin);
       // Toast.makeText(context, "Hola", Toast.LENGTH_SHORT).show();

    }
}
