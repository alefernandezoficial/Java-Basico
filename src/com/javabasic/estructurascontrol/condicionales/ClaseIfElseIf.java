package com.javabasic.estructurascontrol.condicionales;

public class ClaseIfElseIf {
    

    public static void main(String[] args) {
        
        String dia = "Lunes";

        // Ejemplos comparar
        boolean resultadoCompararNum = 5 == 5; // Comparar Numeros
        boolean resultado = dia.equals("Lunes"); // Comparar Textos

        // If else if
        if(dia.equals("Lunes")){
            System.out.println("Hoy es lunes");

        } else if(dia.equals("Martes")){
            System.out.println("Hoy es martes");

        } else if(dia.equals("Miercoles")){
            System.out.println("Hoy es miercoles");

        } else if(dia.equals("Jueves")){
            System.out.println("Hoy es jueves");

        } else if(dia.equals("Viernes")){
            System.out.println("Hoy es viernes");
            
        } else if(dia.equals("Sabado")){
            System.out.println("Hoy es sabado");

        } else if(dia.equals("Domingo")){
            System.out.println("Hoy es domingo");
        } else {
            System.out.println("No es un dia valido");
        }

    }
}
