package com.example.ruben.menuareadibujo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.graphics.Canvas;


public class resultArea extends Activity {

    float radioF;
    float ladoF;
    int eleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiDibujo(this));


        //resultado = (TextView) findViewById(R.id.campoResultado);

        Bundle bundle = getIntent().getExtras();
        eleccion = bundle.getInt("Comprobacion");

        if (eleccion == 0) {
            double areaCirc = bundle.getDouble("AREACIRCULO");
            double radio = bundle.getDouble("RADIO");
            radioF = (float)radio;
            //String areaCirculoString = String.valueOf(areaCirc);
            //resultado.setText("El circulo con el radio: " + radio + " ,tiene un área de: " + areaCirculoString);

        }
        if (eleccion == 1) {


            double areaCuad = bundle.getDouble("AREACUADRADO");
            double lado = bundle.getDouble("LADO");
            ladoF =(float)lado;
            //String areaCuadradoString = String.valueOf(areaCuad);
            //resultado.setText("El cuadrado con el lado: " + lado + " ,tiene un área de: " + areaCuadradoString);
        }
    }

        class MiDibujo extends View {
            public MiDibujo(Context c) {

                super(c);
            }

            protected void onDraw(Canvas canvas) {
                Paint pincel = new Paint();
                pincel.setColor(Color.BLUE); //Color del pincel con el que vamos a dibujar
                pincel.setStrokeWidth(5); //Grosor del pincel
                pincel.setStyle(Paint.Style.FILL);
                if (eleccion==0) {
                    canvas.drawCircle(getWidth() / 2 - radioF / 2, getHeight() / 2 - radioF / 2, radioF, pincel);
                }
                if (eleccion==1){
                    float left = getWidth()/2 - (ladoF/2);
                    float top = getHeight()/2 - (ladoF/2);
                    float rigth = getWidth()/2 + (ladoF/2);
                    float bottom = getHeight()/2 + (ladoF/2);
                    canvas.drawRect(left, top, rigth, bottom, pincel);

                }

            }
        }
    }




