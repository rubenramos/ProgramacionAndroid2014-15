package com.example.ruben.menuareadibujo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class calculoArea extends Activity {

    TextView textViewCuadrado;
    TextView textViewCirculo;
    EditText editTextCuadrado;
    EditText editTextCirculo;
    Button miBoton;
    Spinner miSpinner;
    public static double valorLado;
    public static double valorRadio;
    public static double valorAreaCuadrado;
    public static double valorAreaCirculo;
    final static String figuras[] = {"Circulo", "Cuadrado"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_area);

        textViewCuadrado = (TextView) findViewById(R.id.textView);
        textViewCirculo = (TextView) findViewById(R.id.textView2);
        editTextCuadrado = (EditText) findViewById(R.id.editText);
        editTextCirculo = (EditText) findViewById(R.id.editText2);
        miBoton = (Button) findViewById(R.id.button);
        miSpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> miAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, figuras);
        miAdaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner.setAdapter(miAdaptador);
        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                if (position==0){
                    textViewCuadrado.setVisibility(View.INVISIBLE);
                    editTextCuadrado.setVisibility(View.INVISIBLE);
                }
                else {
                    textViewCuadrado.setVisibility(View.VISIBLE);
                    editTextCuadrado.setVisibility(View.VISIBLE);
                }
                if (position==1){
                    textViewCirculo.setVisibility(View.INVISIBLE);
                    editTextCirculo.setVisibility(View.INVISIBLE);

                }
                else {
                    textViewCirculo.setVisibility(View.VISIBLE);
                    editTextCirculo.setVisibility(View.VISIBLE);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent miIntent = new Intent(calculoArea.this, resultArea.class);
                Bundle bundle = new Bundle();
                if (miSpinner.getSelectedItemPosition()==0) {
                    String valor = editTextCirculo.getText().toString();
                    valorRadio = Double.parseDouble(valor);
                    valorAreaCirculo = (valorRadio * 2) * Math.PI;

                    int estado = 0;

                    bundle.putDouble("AREACIRCULO", valorAreaCirculo);
                    bundle.putDouble("RADIO", valorRadio);
                    bundle.putInt("Comprobacion", estado);
                }
                if (miSpinner.getSelectedItemPosition()==1) {
                    String valor2 = editTextCuadrado.getText().toString();
                    valorLado = Double.parseDouble(valor2);
                    valorAreaCuadrado = valorLado * valorLado;

                    int estado = 1;

                    bundle.putDouble("AREACUADRADO", valorAreaCuadrado);
                    bundle.putDouble("LADO", valorLado);
                    bundle.putInt("Comprobacion", estado);
                }
                miIntent.putExtras(bundle);
                startActivity(miIntent);

            }
        });

    }
}
