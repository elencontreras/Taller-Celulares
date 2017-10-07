package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Datos {

    public static ArrayList<Celular> celulares= new ArrayList<>();

    public static void guardarCelular(Celular p){
        celulares.add(p);
    }

    public static ArrayList<Celular> obtenerCelular(){
        return celulares;
    }
}
