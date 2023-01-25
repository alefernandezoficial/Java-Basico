package com.javabasic.tiposdatosavanzados;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 *      diferencias entre ArrayList y LinkedList:
 * 
 *      ArrayList utiliza un array de forma subyacente.
 *          (El ArrayList que utiliza un Array, es mucho mas rapido para almacenar y buscar datos.)
 *          (El ArrayList deriba de la clase List, por lo tanto implementa o hereda de la clase List.)
 * 
 *      LinkedList NO utiliza un array, sino que utiliza una estructura de datos
 *          que se llama Lista Doblemente Enlazada.
 *          (LinkedList es mas rapida cuando queres modificar datos.)
 *          (Implementa dos interface List y la interface DEQUE para implementar colas. Se meten datos por un sitio y sale por otro.)
 */

public class TipoArrayList {
    public static void main(String[] args) {
        
        // CapacidadVector = CapacidadVector * 2
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        //LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
    }
}

//       1. Forma: array
//        String array[] = new String[lista.size()];
//        for(int i = 0; i < lista.size(); i++){
//            array[i] = lista.get(i);}

//       2. Forma: string elemento
//        for(String elemento : array) {
//            System.out.println("Elemento es: " + elemento);}

//       3. Forma: objectarray
//        for(Object arrayObject : lista.toArray()){
//            System.out.println(arrayObject.toString());}

//       1. Forma: string nombre
//        for (String nombre : lista){
//            System.out.println(nombre);}
//
//       2. Forma: int
//        for (int i = 0; i < lista.size(); i++){
//            System.out.println(lista.get(i));}
