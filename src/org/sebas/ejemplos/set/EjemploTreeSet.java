package org.sebas.ejemplos.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet{
    public static void main(String[] args) {

        //TreeSet tiene un costo de rendimiento, por el ordenamiento
        // Set<String> ts = new TreeSet<>( (a,b) -> b.compareTo(a) );

        /* El constructor de TreeSet tiene sobrecarga de constructores
             1. Constructor recibe un objeto de tipo Comparator para mostrar el orden de los
               elementos invertidos

             2. Constructor recibe cualquiera coleccion que herede de Collections y la pasa
             a TreeSet<>
         */
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("ts = " + ts);

        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("numbers = " + numbers);

    }

}
