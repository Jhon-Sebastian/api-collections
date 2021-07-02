package org.sebas.ejemplos.list;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayListMetodos {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();

        System.out.println(al + ", size = "  + al.size());
        System.out.println("Esta vacia= " + al.isEmpty());

        al.add(new Alumno("Cantinflas",6));
        al.add(new Alumno("Olaf",4));
        al.add(new Alumno("Ra",7));
        al.add(new Alumno("Andres",3));
        al.add(2,new Alumno("Zeus",2));
        al.add(new Alumno("Paco",5));
        al.set(3, new Alumno("ANDREA",5));

        System.out.println(al + ", size = "  + al.size());

        //Usa el equals para comparar y eliminar
        al.remove(new Alumno("ANDREA",5));
        //al.remove(0);
        System.out.println(al + ", size = "  + al.size());

        boolean b = al.contains(new Alumno("Paco",5));
        System.out.println("La lista contiene a Paco =" + b);

        Object[] a = al.toArray();
        for(Object ele : a){
            System.out.println("ele = " + ele);
        }

    }
}
