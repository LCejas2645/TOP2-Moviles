package com.softlc.listadeinmuebles;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cargarDatos();
        generarListView();
    }

    public void generarListView(){

        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.lvMiLista);
        lv.setAdapter(adapter);
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.img1,"perreke",1234.4));
        lista.add(new Inmueble(R.drawable.img2,"gateto",1234.4));
        lista.add(new Inmueble(R.drawable.img3,"apolochece",1234.4));
    }
}