package com.example.eliacerfernandez.spinner02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    final String [] Ciudades= new String []{"Elija la cuidad:","Nueva cajamarca","Rioja","Tarapoto"};
    final String [] Carros= new String []{"Elija la marca de vehiculos:","Yaris","Mercedes","Volvo"};
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
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Ciudades);
        ciudades.setAdapter(adapter);

        ciudades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:

                        break;
                    case 1:
                        Intent nv = new Intent(MainActivity.this,NuevaCajamarca.class);
                        startActivity(nv);
                        break;
                    case 2:
                        Intent rj = new Intent(MainActivity.this,Rioja.class);
                        startActivity(rj);
                        break;
                    case 3:
                        Intent tp = new Intent(MainActivity.this,Tarapoto.class);
                        startActivity(tp);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void CargarMarcas(){
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Carros);
        marcas.setAdapter(adapter);

        marcas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:break;
                    case 1:
                        Intent yr = new Intent(MainActivity.this,Yaris.class);
                        startActivity(yr);
                        break;
                    case 2:
                        Intent md = new Intent(MainActivity.this,Mercedes.class);
                        startActivity(md);
                        break;
                    case 3:
                        Intent vo = new Intent(MainActivity.this,Vovlo.class);
                        startActivity(vo);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
