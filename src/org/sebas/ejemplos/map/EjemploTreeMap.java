package org.sebas.ejemplos.map;

import org.sebas.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {

        // TreeMap -> Ordenado por Keys y no por Values
        // No permite guardar null cono Keys ya que usa el metodo compareTo para ordenar
        // y no puede hacerlo si hay un null

        /*
            TODO: (1-FORMA) Si quieremos ordenar con el compareTo al contrario
            Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());

            TODO: (2-FORMA) Si quieremos ordenar con el compareTo al contrario
            Map<String, Object> persona = new TreeMap<>( (b,a) -> a.compareTo(b));

            TODO: Si queremos ordenar por el largo de las Keys de menor a mayor
            Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));

            TODO: Si queremos ordenar por el largo de las Keys pero al contrario
            Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
         */

        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        persona.put("name","John");
        persona.put("lastName","Doe");
        persona.put("email","doe@mai.com");
        persona.put("age","20");

        Map<String, String> location = new TreeMap<>();
        location.put("country","USA");
        location.put("state","Carolina del Norte");
        location.put("city","Santa Barbara");
        location.put("street","One Street");
        location.put("number","120");

        persona.put("location = ",location);

        System.out.println("person = " + persona);
    }
}
