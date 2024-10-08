package com.example.damsem09_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> estudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Estudiantes");
        // 1. Conectamos nuestro listView a lista a
        lista = findViewById(R.id.listView);

        // 2. Instanciamos la Lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Caballero");
        estudiantes.add("Cañazaca");
        estudiantes.add("Valdivieso");
        estudiantes.add("Flores");
        estudiantes.add("Bonifacio");
        estudiantes.add("...");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );

        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);

        // 5. Enlazamos el evento click con mi lista
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nombreEstudiante = estudiantes.get(position);
        Log.i("DAM","Estudiante Seleccionado:" + nombreEstudiante);
    }
}


