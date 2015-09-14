package com.example.eliacerfernandez.spinner02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    final String [] Ciudades= new String []{"Nueva cajamarca","Rioja","Tarapoto"};
    private Spinner ciudades,marcas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciudades = (Spinner)findViewById(R.id.Ciudades);
        marcas = (Spinner)findViewById(R.id.Marcas);
        CargarCiudades();
        CargarMarcas();

    }

    public void CargarCiudades(){
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,Ciudades);
        ciudades.setAdapter(adapter);
    }

    public void CargarMarcas(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Marca_auto,android.R.layout.simple_spinner_item);
        marcas.setAdapter(adapter);
    }
}
