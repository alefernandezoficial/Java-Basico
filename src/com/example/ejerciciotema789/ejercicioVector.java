package com.example.ejerciciotema789;

import java.util.Vector;

public class ejercicioVector {
//
//      Vector:
//
    public static class EjercicioVector {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Vector\n--------------------");

            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);

            System.out.println("Vector antes de borrar: " + vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println("Vector despues de borrar: " + vector + " -> Eliminados el 2 y 3");

            System.out.println("\n-------------------- \n Respuesta\n--------------------");

            System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                    " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");
        }
    }
}
