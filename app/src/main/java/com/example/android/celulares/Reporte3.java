package com.example.android.celulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte3 extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celulares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte3);
       

        tabla = (TableLayout)findViewById(R.id.tblReporte);
        celulares = Metodos.mostrar(Datos.obtenerCelular());

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);


            c1.setText(""+(i+1));
            c2.setText(celulares.get(i).getCapacidad()+"");
            c3.setText(celulares.get(i).getPrecio()+"");

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);

            tabla.addView(fila);

        }

    }
}

