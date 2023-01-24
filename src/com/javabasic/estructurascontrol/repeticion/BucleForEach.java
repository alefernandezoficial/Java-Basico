package com.javabasic.estructurascontrol.repeticion;

public class BucleForEach {
    public static void main(String[] args) {
        
        String[] nombres = {"Alejandro", "Alexis", "Roberta", "Lola"};

        for(String nombre : nombres){
            System.out.println(nombre);

        }

        int[] numeros = {5, 10, 15};
        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }
        
        System.out.println(suma);
    }
}
