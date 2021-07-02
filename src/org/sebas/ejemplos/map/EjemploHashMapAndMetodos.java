package org.sebas.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapAndMetodos {
    public static void main(String[] args) {

        /*
            Es parte del API de Colecciones de Java, pero no parte es de la interfaz Collectiones,
            pero si permite almacenar Objetos de forma asociativa {llave,valor}
         */

        // La Key debe ser !=, y el Value si se puede repetir
        //Lo que hace es que si repite la Key, muestra el ultimo valor asociado a esa Key y no ambos

        //TODO: El Map usa el HasCode y el Equals para encontrar los valores
        Map<String, Object> persona = new HashMap<>();
        persona.put(null,"1234");
        persona.put(null,"12345");
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        persona.put("email","doe@mai.com");
        persona.put("edad","20");
        System.out.println("persona = " + persona);


        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","Carolina del Norte");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        //TODO: Obtener un Value en especifico de una Key
        //Si quiero obtene una Value en especifico, solo coloco la Key asociada
        String name = (String) persona.get("nombre");
        System.out.println("requestName = " + name);
        String lastName = (String) persona.get("apellido");
        System.out.println("lastName = " + lastName);
        String algoRandom = (String) persona.get("random");
        System.out.println("algoRandom = " + algoRandom);

        // -------------------------------------------------------------------
        //Prueba de como obtener valores de un map, que esta anidado a otro map
        //Ademas de probar el metodo getOrDefault, el cual se le puede asignar un valor si no encuentra un dato
        Map<String, String> obtenerDireccion = (Map<String, String>) persona.get("direccion");
        String pais = obtenerDireccion.get("pais");
        String estado = obtenerDireccion.get("estado");
        String ciudad = obtenerDireccion.get("ciudad");
        String calle = obtenerDireccion.get("calle");
        String numero = obtenerDireccion.get("numero");
        String barrio = obtenerDireccion.getOrDefault("barrio",null);
        System.out.println(pais.concat(", "+estado).concat(", "+ciudad).concat(
                ", "+calle).concat(", "+numero).concat(", "+barrio));
        // -------------------------------------------------------------------

        //TODO: Eliminar atraves de solo la [Key], o de [Key,Value]
        String emailAsociado = (String) persona.remove("email");
        System.out.println("\n**Email eliminado** = " + emailAsociado);
        System.out.println("persona = " + persona);

        boolean apellidoParternoAsociado = persona.remove("apellidoPaterno","Doe");
        System.out.println("\n**Apellido-Paterno eliminado** = " + apellidoParternoAsociado);
        System.out.println("persona = " + persona);


        //TODO: Conocer si contiene una Key o un Value
        boolean existeApellidoPaterno = persona.containsKey("apellidoPaterno");
        System.out.println("\n**Contains-Key**");
        System.out.println("Existe -> {apellidoPaterno} = " + existeApellidoPaterno);

        System.out.println("\n**Contains-Value**");
        boolean existsValue = existeApellidoPaterno = persona.containsValue("20");
        System.out.println("Existe este valor en el Map = " + existsValue);

        //TODO: Obtener todos los valores, sin mantener el orden
        System.out.println("\n**Valores del Map**");
        Collection<Object> valores = persona.values();
        valores.forEach(v -> System.out.print(v+", "));

        //TODO: Obtener todas las keys, sin mantener le orden
        System.out.println("\n\n**Llaves del Map**");
        Set<String> llaves = persona.keySet();
        llaves.forEach(k -> System.out.print(k + ", "));

        //TODO: (1)Mostrar llave y valor, usando una clase/interface Inner(embedida dentro de Map) EntrySet()
        System.out.println("\n\nMap.Entry -> Manejar la Key y el Value al mismo tiempo");
        System.out.println("**Mostrando Key-Value 1ra Forma EntrySet()**");
        for(Map.Entry<String, Object> data : persona.entrySet()){
            Object valor = data.getValue();
            if(valor instanceof Map){
                Map<String, String> info = (Map<String, String>) valor;
                for(Map.Entry<String, String> d : info.entrySet()){
                    System.out.println("\""+d.getKey() + " => " + d.getValue()+"\"");
                }
            }else {
                System.out.println(data.getKey() + " => " + valor);
            }
        }

        //TODO: (2)Mostrar la Key-Value de otra forma Foreach
        System.out.println("\n**Mostrando Key-Value 2da Forma KeySet()**");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            //Para cuando llegue el Map que tenemos anidado
            if(valor instanceof Map){
                String nombre = (String) persona.get("nombre");

                Map<String, String> ubicacion = (Map<String, String>) valor;
                System.out.println("El pais de " + nombre + ": "
                + ubicacion.get("pais"));
                System.out.println("El Ciudad de " + nombre + ": "
                        + ubicacion.get("ciudad"));
                System.out.println("El estado de " + nombre + ": "
                        + ubicacion.get("estado"));
            }else {
                System.out.println(llave + " => " + valor);
            }
        }

        //TODO: (3)Mostrar la Key-Value con Lambda
        System.out.println("\n**Mostrando Key-Value 3da Forma  Java 8 Foreach**");
        persona.forEach( (llave,valor) -> System.out.println(llave + " => " + valor) );

        //Otros Metodos
        System.out.println("\nTamaño = " + persona.size());
        System.out.println("Esta Vacio el Map = " + persona.isEmpty());

        //Reemplazar datos
        System.out.println("\n**Modificar Valores**");
        System.out.println(persona);

        boolean nombreNuevo1 = persona.replace("nombre","John","Nicolas II");
        System.out.println("Nuevo nombre modificado? = " + nombreNuevo1);
        System.out.println(persona);
        String nombreNuevo2 = (String) persona.replace("nombre","Luis III"); // Solo cambia el valor
        System.out.println("Valor modificado = " + nombreNuevo2);
        System.out.println(persona);
    }
}
