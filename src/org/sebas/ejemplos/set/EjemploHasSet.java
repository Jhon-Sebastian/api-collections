package org.sebas.ejemplos.set;

import java.util.*;

public class EjemploHasSet {

    public static void main(String[] args) {

        /*
            El Set tiene varias implementaciones
            ->{
                 1. HashSet = No ordenado, estable, mejor rendimiento, mas rapido al agregar y elim
                 2. TreeSet = Ordenado alfabeticamnete, consume mas recursos por eso
                 3. LinkedHashSet
              }
         */

        //No mantiene ningun orden, pero no permite el duplicar valores
        Set<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        hs.add("Cinco");//Duplique un valor y aun asi no lo muestra doble ves
        //Regresa falso al momento de guardarlo si un valor ya existe
        System.out.println("hs = " + hs);
        
        //Ordenar los valores, se ordena por orden alfabetico
        //Toca transoformar a una lista ya que no permite Set

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println("Set ordenada, gracias a una lista = " + lista);
        
        
    }

}
