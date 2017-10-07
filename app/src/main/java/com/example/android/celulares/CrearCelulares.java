package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearCelulares extends AppCompatActivity {

    private Spinner spinner_SO, spinner_marca, spinner_color;
    private EditText cajaCapacidad, cajaPrecio;
    private String[] opcSo, opcMarca, opcColor;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);

        res =this.getResources();

        spinner_SO = (Spinner)findViewById(R.id.cmbSO);
        spinner_marca= (Spinner)findViewById(R.id.cmbMarca);
        spinner_color = (Spinner)findViewById(R.id.cmbColor);
        cajaCapacidad = (EditText)findViewById(R.id.txtCapacidad);
        cajaPrecio = (EditText)findViewById(R.id.txtPrecio);

        opcSo = res.getStringArray(R.array.opcSO);
        opcMarca = res.getStringArray(R.array.opcMarca);
        opcColor = res.getStringArray(R.array.opcColor);

        ArrayAdapter<String> adap1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opcSo);
        ArrayAdapter<String> adap2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opcMarca);
        ArrayAdapter<String> adap3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opcColor);

        spinner_SO.setAdapter(adap1);
        spinner_marca.setAdapter(adap2);
        spinner_color.setAdapter(adap3);
    }

    public void guardar(View v){
        Double precio;
        int cap, so, marca, color;
        if (validar()) {
        so=spinner_SO.getSelectedItemPosition();
        marca = spinner_marca.getSelectedItemPosition();
        color = spinner_color.getSelectedItemPosition();
        cap = Integer.parseInt(cajaCapacidad.getText().toString());
        precio = Double.parseDouble(cajaPrecio.getText().toString());

            Celular c = new Celular(so, marca, color, cap, precio);

            c.guardar();
            limpiar();

            Toast.makeText(this, res.getString(R.string.msjGuardar), Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar(View v){
        cajaCapacidad.setText("");
        cajaPrecio.setText("");
        spinner_color.setSelection(0);
        spinner_SO.setSelection(0);
        spinner_marca.setSelection(0);
        cajaCapacidad.requestFocus();;
    }

    private void limpiar(){
        cajaCapacidad.setText("");
        cajaPrecio.setText("");
        spinner_color.setSelection(0);
        spinner_SO.setSelection(0);
        spinner_marca.setSelection(0);
        cajaCapacidad.requestFocus();
    }

    private boolean validar(){
        if (cajaCapacidad.getText().toString().isEmpty()){
            cajaCapacidad.setError(res.getString(R.string.error1));
            cajaCapacidad.requestFocus();
            return false;
        }
        if (cajaPrecio.getText().toString().isEmpty()){
            cajaPrecio.setError(res.getString(R.string.error2));
            cajaPrecio.requestFocus();
            return false;
        }
        if (Metodos.validarCapacidad(Integer.parseInt(cajaCapacidad.getText().toString()))){
            cajaCapacidad.setError(res.getString(R.string.error3));
            cajaCapacidad.requestFocus();
            return false;
        }
        if (Metodos.validarPrecio(Double.parseDouble(cajaPrecio.getText().toString()))){
            cajaPrecio.setError(res.getString(R.string.error4));
            cajaPrecio.requestFocus();
            return false;
        }
        return true;
    }
}
