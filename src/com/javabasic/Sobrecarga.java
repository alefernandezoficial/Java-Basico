package com.javabasic;

/**
 *      Sobrecarga permite duplicar un metodo siempre y cuando
 *      tengan diferente numero/tipo de parametros.
 */

public class Sobrecarga {

    public static void main(String[] args) {

        
    }
    static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    static double suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }

}