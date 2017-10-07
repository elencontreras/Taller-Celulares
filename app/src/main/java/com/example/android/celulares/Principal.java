package com.example.android.celulares;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private ListView lstopciones;
    private Resources res;
    private String[] opc;
    private Intent i;
    private Context contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        res =this.getResources();
        contexto =this;

        lstopciones = (ListView)findViewById(R.id.lstOpciones);

        opc = res.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lstopciones.setAdapter(adapter);

        lstopciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos){
                    case 0:
                        i = new Intent(Principal.this, CrearCelulares.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this, Listado.class);
                        startActivity(i);
                        break;
                    case 2:
                        Toast.makeText(contexto,Metodos.cantidadAppleNegro(Datos.obtenerCelular())+"",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(contexto,Metodos.promedioNokia(Datos.obtenerCelular())+"",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        i = new Intent(Principal.this, Reporte3.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
