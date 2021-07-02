package org.sebas.ejemplos.list;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        //Tambien funciona para LinkedList<>
        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Cantinflas",6));
        sa.add(new Alumno("Olaf",4));
        sa.add(new Alumno("Ra",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Paco",5));
        sa.add(new Alumno("Paco",5));
        // Collections.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        //sa.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));

        //Ordenando utilizando Java 8
        // 1.Parameter: Tipo de dato, 2.Parameter: dato a tener en cuenta por ordenar
        // sa.sort(Comparator.comparing( (Alumno a) -> a.getNota()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());

        System.out.println("\n**Iterando usando expresiones lamba**");
        sa.forEach(System.out::print);


    }
}
