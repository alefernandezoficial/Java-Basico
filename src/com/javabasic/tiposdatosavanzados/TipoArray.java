package com.javabasic.tiposdatosavanzados;

public class TipoArray {

    public static void main(String[] args) {
//        int arrayUno[] = new int[5];
//        arrayUno[0] = 1;
//        arrayUno[1] = 2;
//        arrayUno[2] = 3;
//        arrayUno[3] = 4;
//        arrayUno[4] = 5;

//        +---+---+---+---+---+---+
//        | 0 | 1 | 2 | 3 | 4 | 5 |
//        +---+---+---+---+---+---+

        String nombres[] = {
            "Alejandro",
            "Alexis",
            "Roberta",
            "Lola"
        };

        // Forma corta 
        // Ventaja accedemos directamente al valor y es mas sencilla de escribir
        // Sin embargo, no podemos acceder a la posicion del array
//      for (String nombre : nombres){
//      System.out.println("Nombre actual: " + nombre);}

        // Forma larga
        // Ventaja (no siempre) para saber la longitud
//      for (int i = 0; i < nombres.length; i++){
//      System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);}

        // Array bidimendional
        // Es como implementar una hoja de calculo Excel
        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        // 2 filas x 4 columnas
//        int arrayBi[][] = {
//            { 1, 2, 3, 4 },
//            { 10, 20, 30, 40 }

        for (int i = 0; i < arrayBidi.length; i++){
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidi[1].length; j++){
                System.out.println("Estoy en i = " + i + ", j =" + j);
                System.out.println(arrayBidi[i][j]);
            }
        }
    }
}
