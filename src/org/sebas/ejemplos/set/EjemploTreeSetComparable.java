package org.sebas.ejemplos.set;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        /*
            Una manera mas sencilla de implenetar la interfazc comparator
            es usar una espresion lamba donde indiquemos por cual atributo
            vamos a comparar y en que orden, y con ello evitamos implementar dichar
            interfaz para evitar errores

            ASC _> (a,b) -> a.getNombre().compareTo(b.getNombre())
            DES _> (a,b) -> b.getNombre().compareTo(a.getNombre())
         */

        //El TreeSet utilizar la interfaz Comparator<T> para ver si un dato esta repetido

        Set<Alumno> sa = new TreeSet<>( (a,b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Paco",5));
        sa.add(new Alumno("Venito",21));

        System.out.println("sa = " + sa);


    }
}
