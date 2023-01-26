package com.example.ejerciciotema789;

public class ejercicioArrayBidimensional {
    
//
//        array bidimensional de enteros.
//

public static class ArrayBidimensional {

    public static void main(String[] args) {

        System.out.println("-------------------- \n Array Bidimensional\n--------------------");

        Integer[][] numeros = {
                {5, 10, 15},
                {20, 25, 30}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int y = 0; y < numeros[i].length; y++) {

                System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                        "\nEl valor es: " + numeros[i][y] + "\n");
            }
        }
    }
}
}
