package com.javabasic;

/**
 * Crear un proyecto java desde cero.
 * Crear un paquete.
 * Dentro del paquete crear una clase.
 * Dentro de la clase crear un metodo main.
 * Imprimir todos los tipos de datos vistos.
 * 
 * Tipo de datos mas comunes:
 * int, long, double, boolean, String
 * 
 */

public class Tipos {
    public static void main(String[] args) {
        
        // 1. Numeros

        // 1.1 Enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;

        // 1.2 Decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;

        // 2. Booleano
        boolean variable7 = false;
        boolean variable8 = true;

        // 3. Texto
        char variable9 = 'a';
        String variable10 = "Texto";


        // Impresion de todos los tipos de datos
        // 1.1 Enteros
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);

        // 1.2 Decimales
        System.out.println(variable5);
        System.out.println(variable6);

        // 2. Booleano
        System.out.println(variable7);
        System.out.println(variable8);

        // 3. Texto
        System.out.println(variable9);
        System.out.println(variable10);
    }
}
