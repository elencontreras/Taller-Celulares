package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Metodos {

    public static int cantidadAppleNegro(ArrayList<Celular> celulares) {
        int cont = 0;
        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca() == 0 && celulares.get(i).getColor() == 1) cont++;
        }
        return cont;
    }

    public static double promedioNokia(ArrayList<Celular> celulares) {
        int cont = 0;
        double prom  ,sum=0;
        for (int i = 0; i < celulares.size(); i++) {

            if (celulares.get(i).getMarca() == 3) {

                sum = sum + celulares.get(i).getPrecio();
                cont++;
            }
        }
        prom = sum/cont;
        System.out.println("sum"+sum);
        System.out.println("cont"+cont);
        return prom;
    }



    public static ArrayList<Celular> mostrar(ArrayList<Celular> celulares) {
        ArrayList<Celular> celu = new ArrayList<>();

        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca() == 2 && celulares.get(i).getColor() == 1 && celulares.get(i).getSistemaOp() == 0) celu.add(celulares.get(i));
        }
        return celu;

    }

    public static boolean validarCapacidad(int capacidad){
        if (capacidad == 0)return true;
        else return false;
    }

    public static boolean validarPrecio(double precio){
        if (precio == 0) return true;
        else return false;
    }
}
