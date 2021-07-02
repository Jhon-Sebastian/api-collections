package org.sebas.ejemplos.set;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // El HashSet utiliza el metodo equals y el codigo hash(por referencia)
        // para comparar si hay datos repetidos

        /*
            Para evitar que se dupliquen, ya que podemos tener
            2 objetos con los mismo valores pero distinta lugar de alamcenamiento
            en memoria, los va a tomar como distintos, para evitar ello
            implementamos el metodo equals y hasCode en el que indiquemos
            por que valores queremos comparar sin importar la direccion de memoria
        */

        //List<Alumno> bu = new ArrayList<>();
        Set<Alumno> bu = new HashSet<>();
        bu.add(new Alumno("Fernanda",6));
        bu.add(new Alumno("Anastacia",4));
        bu.add(new Alumno("Jano",7));
        bu.add(new Alumno("Andres",3));
        bu.add(new Alumno("Zeus",2));
        bu.add(new Alumno("Paco",5));
        bu.add(new Alumno("Paco",5));

        //System.out.println("sa = " + bu);

        /*
            Para imprimir las Set<> HashSet<> && Set<> TreeSet<> funcionan todas las formas
            exceptuando el for clasico, ya que el Set<> no incluye el metodo .get() el cual
            obtiene el elemento por lo tanto no se puede mostrar

         */

        // List<> funcionan todas las formas de mostrar los datos
        /*
            System.out.println("\n**Iterando utilizando un for clasico**");
            for(int i = 0; i < bu.size(); i++){
                System.out.print(bu.get(i));
            }
         */

        System.out.println("\n**Iterando usando Foreach**");
        for(Alumno a : bu){
            System.out.print(a);
        }

        System.out.println("\n**Iterando usando while e iterator**");
        Iterator<Alumno> it = bu.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.print(a);
        }

        System.out.println("\n**Iterando usando expresiones lamba**");
        bu.forEach(System.out::print);


    }
}
