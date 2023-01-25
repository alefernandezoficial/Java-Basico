package com.javabasic.tiposdatosavanzados;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *      Que es un mapa?
 *  - Un mapa recibe varios nombres, los dos mas comunes son Mapas y ArrayAsociativo
 *  - Un mapa es un diccionario donde tengo una clave y un valor, ese valor podria ser
 *  - otro mapa, bigdecimal, string, array, etc.
 * 
 *      mapa.put(); Reemplaza sobre el valor actual.
 *      mapa.repleace(); Reemplaza el valor pero si no existe la clave la ignora.
 *      mapa.remove(); Elimina valores.
 * 
 *      Map.Entry se le asigna tanto el Key como el Value.
 * 
 *      Arboles rojos negros, estructuras de datos.
 */

public class Mapas {
    public static void main(String[] args) {
        
//      Forma primitiva de mapa HashMap
//      array["clave1"] = 10
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento value es: " + elemento.getValue());
        }

    }
}
