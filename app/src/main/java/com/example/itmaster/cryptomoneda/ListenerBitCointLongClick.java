package com.example.itmaster.cryptomoneda;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ListenerBitCointLongClick implements View.OnLongClickListener {
    private Activity context;

    public ListenerBitCointLongClick(Activity context) {
        this.context = context;
    }

    @Override
    public boolean onLongClick(View v) {
        Intent bitcoin = new Intent(context, Ejemplo_activity.class);
        context.startActivity(bitcoin);
        return true;
    }
}
