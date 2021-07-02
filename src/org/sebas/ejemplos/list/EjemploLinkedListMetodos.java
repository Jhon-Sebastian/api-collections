package org.sebas.ejemplos.list;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedListMetodos {
    public static void main(String[] args) {

        LinkedList<Alumno> linkedList = new LinkedList<>();

        System.out.println("Tamaño= " + linkedList.size());
        System.out.println("Vacia?= " + linkedList.isEmpty());

        linkedList.add(new Alumno("Jehova",1));
        linkedList.add(new Alumno("Noe",2));
        linkedList.add(new Alumno("Ra",3));
        linkedList.add(new Alumno("Cristo",6));
        linkedList.add(new Alumno("Ronnaldinho",7));

        System.out.println(linkedList + ", Tamaño= " + linkedList.size());

        linkedList.addFirst(new Alumno("Apolo",30));
        linkedList.addLast(new Alumno("Atenea",20));

        System.out.println(linkedList + ", Tamaño= " + linkedList.size());

        /*
            Ademas del getFirst y getLast existe el peek
            Hace lo mismo que esos metodos solo que este arrojan null si no encuentra el valor
            y no una exception como ocurre con estos metodos
         */
        System.out.println("\nPrimer elemento con Exception= " + linkedList.getFirst());
        System.out.println("Ultimo elemento con Exception= " + linkedList.getLast());

        System.out.println("Primer elemento sin Exception= " + linkedList.peekFirst());
        System.out.println("Ultimo elemento sin Exception= " + linkedList.peekLast());

        //remove
        //Eliminar y retornar el objeto eliminado
        /*
            Ocurre lo mismo para encontrar y eliminar, existe unos metodos que no arrojan exception
            si no null, con el metodo poll en lugar de remove
         */
        System.out.println("\nPrimer Eliminado con Exception= " + linkedList.removeFirst());
        System.out.println("Ultimo Eliminado con Exception= " + linkedList.removeLast());

        System.out.println("Primer Eliminado sin Exception= " + linkedList.pollFirst());
        System.out.println("Ultimo Eliminado sin Exception= " + linkedList.pollLast());

        System.out.println("\n"+linkedList);

        Alumno a = new Alumno("Lucas",5);
        linkedList.addLast(a);

        System.out.println("\n"+linkedList);

        //indexOf -> obtener el indice del elemento
        //Utiliza el equals para buscar
        System.out.println("\nIndice de Lucas= " + linkedList.indexOf(a));

        linkedList.set(3,new Alumno("Nuevo Alumno",7));

        System.out.println("\n"+linkedList);


        //Diferencias y ejemplo del ListIterator
        ListIterator<Alumno> li = linkedList.listIterator();

        //Tiene varios metodos, hasNext()-> Siguiente elemento, hasPrevious-> Elemento anterior
        System.out.println("\n**ListIterator-Next**");
        while(li.hasNext()){
            //Iterando hacia adelante y mostrando los elementos
            System.out.println(li.next());
        }

        //Como la lista ya no tiene mas elementos, podemos retroceder
        System.out.println("\n**ListIterator-Previous**");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

    }
}
