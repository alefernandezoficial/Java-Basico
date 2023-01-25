package com.javabasic.tiposdatosavanzados;

import java.util.Vector;

public class TipoVectores {

/**
 *          IMPORTANTE DE VECTORES.
 *          1. Son Arrays dinamicos.
 *          2. Los vectores creyen automaticamente.
 *          3. Los avectores pueden decrecer al tamaño de sus elementos.
 *          4. Y que tanto de que crecer y que sea un array no es gratuito computacionalmente hablando.
 * 
 *           ***************************************************************************************
 *          (Si un vector esta creciendo constantemente podemos relentizar la ejecucion del programa)
 *           ***************************************************************************************
 * 
 *          Intentar reducir el numero de copias del array
 *          cuanto mas array alla en la ejecucion mas lento se ejecutara.
 */

        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        for(int i : vector){
            System.out.println("Valor actual en vector: " + i);
        }

        for(int i = 0; i < vector.size(); i++){
            System.out.println("Valor es: " + vector.get(i) + " en posicion: " + i);
        }





//        Vector<Integer> vector2 = new Vector<>();
//        vector2.add(1);
//        vector2.add(2);
//        boolean resultado = vector.equals(vector2);
//        System.out.println("Son iguales? " + resultado);
    }
}
