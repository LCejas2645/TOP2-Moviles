package com.softlc.listadeinmuebles;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Inmueble>> listaA;



    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaA = new MutableLiveData<>();
    }

    public MutableLiveData<List<Inmueble>>  getListaA() {
        return listaA;
    }

    public void setListaA(MutableLiveData<List<Inmueble>> listaA) {
        this.listaA = listaA;
    }

    public void cargarDatos(){
        ArrayList<Inmueble> lista = new ArrayList<>();
        lista.add(new Inmueble(R.drawable.imgjk,"Juana Koslai",123004.4));
        lista.add(new Inmueble(R.drawable.imgn,"Nogoli",12354.4));
        lista.add(new Inmueble(R.drawable.imgp,"Potrero",1246634.4));
        listaA.setValue(lista);
   }

}
