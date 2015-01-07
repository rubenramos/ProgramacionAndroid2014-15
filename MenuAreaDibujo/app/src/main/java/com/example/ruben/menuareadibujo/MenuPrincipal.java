package com.example.ruben.menuareadibujo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        final Button miBoton1 = (Button) findViewById(R.id.boton1);
        final Button miBoton2 = (Button) findViewById(R.id.boton2);

        miBoton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent = new Intent(MenuPrincipal.this, calculoArea.class);
                startActivity(miIntent);
            }
        });

        miBoton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent = new Intent(MenuPrincipal.this, dibujar.class);
                startActivity(miIntent);
            }
        });


    }
}
