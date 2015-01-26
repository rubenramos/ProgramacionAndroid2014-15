package com.example.ruben.pruebamarcador;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class prueba extends Activity {
    RadioGroup rg;
    RadioButton rBSergio;
    RadioButton rBFallo;
    static int ResultadoPilar;
    static int ResultadoVisitante;
    static int puntosSergio = 0;
    static int t2Metidos = 0;
    static int t2Totales = 0;
    static int t3Metidos = 0;
    static int t3Totales = 0;
    static int tlMetidos = 0;
    static int tlTotales = 0;
    static int rebotes = 0;
    static int asistencias = 0;
    static int tapones = 0;
    static int recuperaciones = 0;
    static int faltas = 0;
    static int faltasRecibidas = 0;
    static int perdidas = 0;
    static int valoracion = 0;
    Button boton2P;
    Button boton2PFallado;
    Button boton3P;
    Button boton3PFallado;
    Button botonTL;
    Button botonTLFallado;
    Button botonRebote;
    Button botonAsistencia;
    Button botonTapon;
    Button botonRecuperacion;
    Button botonFalta;
    Button botonFaltaRecibida;
    Button botonPerdida;
    Button botonBorrar;
    Button botonElPilar;
    Button botonVisitante;
    EditText ETPuntosPilar;
    EditText ETPuntosVisitante;
    EditText ETpuntos;
    EditText ET2P;
    EditText ET3P;
    EditText ETTL;
    EditText ETRebotes;
    EditText ETAsistencias;
    EditText ETTapones;
    EditText ETRecuperacion;
    EditText ETFalta;
    EditText ETFaltaRecibida;
    EditText ETPerdidas;
    EditText ETValoracion;

    String puntos;
    String t2Met;
    String t3Met;
    String t2Tot;
    String t3Tot;
    String tlMet;
    String tlTot;
    String val;
    String reb;
    String asis;
    String tapns;
    String recs;
    String falt;
    String faltRec;
    String perd;
    String resultPilar;
    String resultVisit;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        rg = (RadioGroup)findViewById(R.id.rg);
        rBSergio = (RadioButton)findViewById(R.id.radioButtonSergio);
        rBSergio = (RadioButton)findViewById(R.id.radioButtonFallo);
        botonElPilar = (Button)findViewById(R.id.buttonSumarPilar);
        botonVisitante = (Button)findViewById(R.id.buttonSumaVisitante);
        boton2P = (Button)findViewById(R.id.button2P);
        boton2PFallado = (Button)findViewById(R.id.button2PFallado);
        boton3P = (Button)findViewById(R.id.button3P);
        boton3PFallado = (Button)findViewById(R.id.button3PFallado);
        botonTL = (Button)findViewById(R.id.buttonTL);
        botonTLFallado = (Button)findViewById(R.id.buttonTLFallado);
        botonRebote = (Button)findViewById(R.id.buttonRebote);
        botonAsistencia = (Button)findViewById(R.id.buttonAsistencia);
        botonTapon = (Button)findViewById(R.id.buttonTapon);
        botonRecuperacion =(Button)findViewById(R.id.buttonRec);
        botonFalta = (Button)findViewById(R.id.buttonFalta);
        botonFaltaRecibida = (Button)findViewById(R.id.buttonFaltaRec);
        botonPerdida = (Button)findViewById(R.id.buttonPerd);
        botonBorrar = (Button)findViewById(R.id.buttonBorrar);
        ETPuntosPilar = (EditText)findViewById(R.id.editTextElPilar);
        ETPuntosVisitante = (EditText)findViewById(R.id.editTextVisitante);
        ETpuntos = (EditText) findViewById(R.id.editTextPuntos);
        ET2P = (EditText) findViewById(R.id.editTextT2);
        ET3P = (EditText) findViewById(R.id.editTextT3);
        ETTL = (EditText) findViewById(R.id.editTextTL);
        ETRebotes = (EditText) findViewById(R.id.editTextRebotes);
        ETAsistencias = (EditText) findViewById(R.id.editTextAsistencias);
        ETTapones = (EditText) findViewById(R.id.editTextTapones);
        ETRecuperacion = (EditText) findViewById(R.id.editTextRecuperaciones);
        ETFalta = (EditText) findViewById(R.id.editTextFaltas);
        ETFaltaRecibida = (EditText) findViewById(R.id.editTextFaltasRecibidas);
        ETPerdidas = (EditText) findViewById(R.id.editTextPerdidas);
        ETValoracion = (EditText) findViewById(R.id.editTextValoracion);
        final TextView nombreVisitante =(TextView)findViewById(R.id.textViewVis);



        botonElPilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultadoPilar = ResultadoPilar+1;
                resultPilar=String.valueOf(ResultadoPilar);
                ETPuntosPilar.setText(resultPilar);
            }
        });
        botonVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultadoVisitante = ResultadoVisitante+1;
                resultVisit=String.valueOf(ResultadoVisitante);
                ETPuntosVisitante.setText(resultVisit);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if( group.getCheckedRadioButtonId()==R.id.radioButtonSergio){

                    Bundle bundle = getIntent().getExtras();
                    nombreVisitante.setText(bundle.getString("nombre"));

                    boton2P.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            puntosSergio= puntosSergio +2;
                            valoracion = valoracion +2;
                            t2Metidos = t2Metidos + 1;
                            t2Totales = t2Totales + 1;
                            ResultadoPilar = ResultadoPilar+2;
                            resultPilar=String.valueOf(ResultadoPilar);
                            ETPuntosPilar.setText(resultPilar);
                            val=String.valueOf(valoracion);
                            puntos=String.valueOf(puntosSergio);
                            t2Met=String.valueOf(t2Metidos);
                            t2Tot=String.valueOf(t2Totales);
                            ETpuntos.setText(puntos);
                            ET2P.setText(t2Met+"/"+t2Tot);
                            ETValoracion.setText(val);
                        }
                    });
                    boton2PFallado.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion -1;
                            t2Totales = t2Totales+1;
                            val=String.valueOf(valoracion);
                            t2Tot=String.valueOf(t2Totales);
                            ET2P.setText(t2Met+"/"+t2Tot);
                            ETValoracion.setText(val);

                        }
                    });
                    boton3P.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            puntosSergio= puntosSergio +3;
                            valoracion = valoracion +3;
                            t3Metidos = t3Metidos + 1;
                            t3Totales = t3Totales + 1;
                            ResultadoPilar = ResultadoPilar+3;
                            resultPilar=String.valueOf(ResultadoPilar);
                            ETPuntosPilar.setText(resultPilar);
                            val=String.valueOf(valoracion);
                            puntos=String.valueOf(puntosSergio);
                            t3Met=String.valueOf(t3Metidos);
                            t3Tot=String.valueOf(t3Totales);
                            ETpuntos.setText(puntos);
                            ET3P.setText(t3Met+"/"+t3Tot);
                            ETValoracion.setText(val);

                        }
                    });
                    boton3PFallado.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion -1;
                            t3Totales = t3Totales + 1;
                            val=String.valueOf(valoracion);
                            t3Tot=String.valueOf(t3Totales);
                            ET3P.setText(t3Met+"/"+t3Tot);
                            ETValoracion.setText(val);

                        }
                    });
                    botonTL.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            puntosSergio = puntosSergio+1;
                            valoracion = valoracion +1;
                            tlMetidos = tlMetidos+1;
                            tlTotales = tlTotales+1;
                            ResultadoPilar = ResultadoPilar+1;
                            resultPilar=String.valueOf(ResultadoPilar);
                            ETPuntosPilar.setText(resultPilar);
                            val=String.valueOf(valoracion);
                            puntos=String.valueOf(puntosSergio);
                            tlMet=String.valueOf(tlMetidos);
                            tlTot=String.valueOf(tlTotales);
                            ETpuntos.setText(puntos);
                            ETTL.setText(tlMet+"/"+tlTot);
                            ETValoracion.setText(val);


                        }
                    });
                    botonTLFallado.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion -1;
                            tlTotales = tlTotales + 1;
                            val=String.valueOf(valoracion);
                            tlTot=String.valueOf(tlTotales);
                            ETTL.setText(tlMet+"/"+tlTot);
                            ETValoracion.setText(val);
                        }
                    });
                    botonRebote.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion +1;
                            rebotes = rebotes +1;
                            reb=String.valueOf(rebotes);
                            val=String.valueOf(valoracion);
                            ETRebotes.setText(reb);
                            ETValoracion.setText(val);


                        }
                    });
                    botonRecuperacion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion +1;
                            recuperaciones = recuperaciones +1;
                            recs=String.valueOf(recuperaciones);
                            val=String.valueOf(valoracion);
                            ETRecuperacion.setText(recs);
                            ETValoracion.setText(val);

                        }
                    });
                    botonAsistencia.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion +1;
                            asistencias = asistencias +1;
                            asis=String.valueOf(asistencias);
                            val=String.valueOf(valoracion);
                            ETAsistencias.setText(asis);
                            ETValoracion.setText(val);

                        }
                    });
                    botonTapon.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion +1;
                            tapones = tapones +1;
                            tapns=String.valueOf(tapones);
                            val=String.valueOf(valoracion);
                            ETTapones.setText(tapns);
                            ETValoracion.setText(val);

                        }
                    });
                    botonFalta.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion -1;
                            faltas = faltas +1;
                            falt=String.valueOf(faltas);
                            val=String.valueOf(valoracion);
                            ETFalta.setText(falt);
                            ETValoracion.setText(val);

                        }
                    });
                    botonFaltaRecibida.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion +1;
                            faltasRecibidas = faltasRecibidas +1;
                            faltRec=String.valueOf(faltasRecibidas);
                            val=String.valueOf(valoracion);
                            ETFaltaRecibida.setText(faltRec);
                            ETValoracion.setText(val);

                        }
                    });
                    botonPerdida.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            valoracion = valoracion -1;
                            perdidas = perdidas +1;
                            perd=String.valueOf(perdidas);
                            val=String.valueOf(valoracion);
                            ETPerdidas.setText(perd);
                            ETValoracion.setText(val);

                        }
                    });








                    botonBorrar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ResultadoPilar = 0;
                            ResultadoVisitante = 0;
                            puntosSergio = 0;
                            t2Metidos = 0;
                            t2Totales = 0;
                            valoracion = 0;
                            t3Metidos = 0;
                            t3Totales = 0;
                            tlMetidos = 0;
                            tlTotales = 0;
                            rebotes = 0;
                            asistencias = 0;
                            tapones = 0;
                            faltas = 0;
                            faltasRecibidas = 0;
                            perdidas = 0;
                            recuperaciones = 0;

                            resultPilar=String.valueOf(ResultadoPilar);
                            resultVisit=String.valueOf(ResultadoVisitante);
                            val=String.valueOf(valoracion);
                            puntos=String.valueOf(puntosSergio);
                            t2Met=String.valueOf(t2Metidos);
                            t2Tot=String.valueOf(t2Totales);
                            t3Met=String.valueOf(t3Metidos);
                            t3Tot=String.valueOf(t3Totales);
                            tlMet=String.valueOf(tlMetidos);
                            tlTot=String.valueOf(tlTotales);
                            reb=String.valueOf(rebotes);
                            asis=String.valueOf(asistencias);
                            tapns=String.valueOf(tapones);
                            falt=String.valueOf(faltas);
                            faltRec=String.valueOf(faltasRecibidas);
                            perd=String.valueOf(perdidas);
                            recs=String.valueOf(recuperaciones);

                            ETPuntosPilar.setText(resultPilar);
                            ETPuntosVisitante.setText(resultVisit);
                            ETpuntos.setText(puntos);
                            ET2P.setText(t2Met+"/"+t2Tot);
                            ET3P.setText(t3Met+"/"+t3Tot);
                            ETTL.setText(tlMet+"/"+tlTot);
                            ETRebotes.setText(reb);
                            ETAsistencias.setText(asis);
                            ETValoracion.setText(val);
                            ETTapones.setText(tapns);
                            ETRecuperacion.setText(recs);
                            ETFalta.setText(falt);
                            ETFaltaRecibida.setText(faltRec);
                            ETPerdidas.setText(perd);
                        }
                    });


                }

                if(group.getCheckedRadioButtonId() == R.id.radioButtonFallo){
                    boton2P.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            puntosSergio = puntosSergio -2;
                            String resultado=String.valueOf(puntosSergio);
                            ETpuntos.setText(resultado);

                        }
                    });
                }
            }
        });




    }
}
