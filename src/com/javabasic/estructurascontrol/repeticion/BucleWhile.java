package com.javabasic.estructurascontrol.repeticion;

public class BucleWhile {
    
    public static void main(String[] args) {
        
        // Bucle infinito, se usa para evaluar condiciones
        int contador = 0;

        while(contador < 10){
            contador++;
            if(contador == 5){
                // break;
                continue;
            }
            System.out.println("Valor de contador  " + contador);
        }
        // Variable nombre esta fuera del ambito del que se creo
        // System.out.println(nombre);
    }
}
