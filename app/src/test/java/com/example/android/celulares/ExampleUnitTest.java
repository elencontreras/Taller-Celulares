package com.example.android.celulares;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cantidad_apple_negros(){
        Celular c1= new Celular(1,0,1,4,100000);
        Celular c2= new Celular(1,0,1,4,100000);
        Celular c3= new Celular(1,1,1,4,100000);
        Celular c4= new Celular(1,0,1,4,100000);


        Celular celular[]={c1,c2,c3,c4};

        ArrayList<Celular> pers = new ArrayList<>(Arrays.asList(celular));

        assertEquals(3, Metodos.cantidadAppleNegro(pers));

    }
    @Test
    public void cantidad_apple_negros_incorrecta(){
        Celular c1= new Celular(1,0,1,4,100000);
        Celular c2= new Celular(1,0,1,4,100000);
        Celular c3= new Celular(1,1,1,4,100000);
        Celular c4= new Celular(1,0,1,4,100000);


        Celular celular[]={c1,c2,c3,c4};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));

        assertNotEquals(2, Metodos.cantidadAppleNegro(cel));

    }

    @Test
    public void promedio_nokia_correcto(){
        Celular c1= new Celular(0,3,1,4,100000);
        Celular c2= new Celular(0,3,1,4,150000);
        Celular c3= new Celular(0,3,1,4,300000);
        Celular c4= new Celular(0,3,1,4,50000);
        Celular c5= new Celular(0,2,1,4,100000);
        Celular c6= new Celular(0,1,1,4,100000);
        Celular c7= new Celular(0,1,1,4,100000);
        Celular c8= new Celular(0,0,1,4,100000);

        Celular celular[]={c1,c2,c3,c4,c5,c6,c7,c8};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));

        assertEquals(150000, Metodos.promedioNokia(cel),0);
    }

    @Test
    public void promedio_nokia_incorrecto(){
        Celular c1= new Celular(0,3,1,4,100000);
        Celular c2= new Celular(0,3,1,4,150000);
        Celular c3= new Celular(0,3,1,4,300000);
        Celular c4= new Celular(0,3,1,4,50000);
        Celular c5= new Celular(0,2,1,4,100000);
        Celular c6= new Celular(0,1,1,4,100000);
        Celular c7= new Celular(0,1,1,4,100000);
        Celular c8= new Celular(0,0,1,4,100000);


        Celular celular[]={c1,c2,c3,c4,c5,c6,c7,c8};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));


        assertNotEquals(60000, Metodos.promedioNokia(cel),0);
    }

    @Test
    public void samsung_negros_android(){
        Celular c1= new Celular(0,2,1,4,100000);
        Celular c2= new Celular(0,2,1,2,150000);
        Celular c3= new Celular(0,2,1,16,300000);
        Celular c4= new Celular(0,2,1,8,50000);
        Celular c5= new Celular(0,2,0,4,100000);
        Celular c6= new Celular(0,1,0,4,100000);
        Celular c7= new Celular(0,1,0,4,100000);
        Celular c8= new Celular(0,0,0,4,100000);

        Celular celular[]= {c1,c2,c3,c4,c5,c6,c7,c8};
        Celular cumplen[] ={c1,c2,c3,c4};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));
        ArrayList<Celular> cum = new ArrayList<>(Arrays.asList(cumplen));

        assertEquals(cum, Metodos.mostrar(cel));
    }

    @Test
    public void samsung_negros_android_incorrecto(){
        Celular c1= new Celular(0,2,1,4,100000);
        Celular c2= new Celular(0,2,1,2,150000);
        Celular c3= new Celular(0,2,1,16,300000);
        Celular c4= new Celular(0,2,1,8,50000);
        Celular c5= new Celular(0,2,0,4,100000);
        Celular c6= new Celular(0,1,0,4,100000);
        Celular c7= new Celular(0,1,0,4,100000);
        Celular c8= new Celular(0,0,0,4,100000);

        Celular celular[]= {c1,c2,c3,c4,c5,c6,c7,c8};
        Celular cumplen[] ={c1,c2};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));
        ArrayList<Celular> cum = new ArrayList<>(Arrays.asList(cumplen));
        assertNotEquals(cum, Metodos.mostrar(cel));
    }

    @Test
    public void validar_capacidad_correcto(){
        assertTrue(Metodos.validarCapacidad(0));
    }
    @Test
    public void validar_capacidad_incorrecto(){
        assertFalse(Metodos.validarCapacidad(2));
    }
    @Test
    public void validar_precio_correcto(){
        assertTrue(Metodos.validarPrecio(0));
    }
    @Test
    public void validar_precio_incorrecto(){
        assertFalse(Metodos.validarPrecio(200000));
    }

}