package com.example.android.celulares;

/**
 * Created by Android on 30/09/2017.
 */

public class Celular {

    private int sistemaOp;
    private int marca;
    private int color;
    private int capacidad;
    private double precio;

    public Celular(int sistemaOp, int marca, int color, int capacidad, double precio) {
        this.sistemaOp = sistemaOp;
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(int sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardarCelular(this);
    }
}
