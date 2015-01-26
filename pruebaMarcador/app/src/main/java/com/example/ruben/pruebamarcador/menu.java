package com.example.ruben.pruebamarcador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class menu extends Activity {

    private Button jugar;
    public static int COD_RESPUESTA=0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        jugar = (Button) findViewById(R.id.bJugar);
        final EditText ETNombreEquipo = (EditText)findViewById(R.id.editTextNombreEquipo);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent miIntent = new Intent(menu.this, prueba.class);
                startActivity(miIntent);
                Bundle bundle = new Bundle();
                String nombreEq= ETNombreEquipo.getText().toString();
                bundle.putString("nombre", nombreEq);
                miIntent.putExtras(bundle);
                startActivityForResult(miIntent, COD_RESPUESTA);

            }
        });
    }

}
