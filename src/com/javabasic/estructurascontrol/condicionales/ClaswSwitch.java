package com.javabasic.estructurascontrol.condicionales;

public class ClaswSwitch {
    
    public static void main(String[] args) {
        
        String dia = "Lunes";

        switch(dia){
            case "Lunes":
                System.out.println("Hoy es lunes");
            break;

            case "Martes":
                System.out.println("Hoy es martes");
            break;

            case "Miercoles":
                System.out.println("Hoy es miercoles");
            break;

            case "Jueves":
                System.out.println("Hoy es jueves");
            break;

            case "Viernes":
                System.out.println("Hoy es viernes");
            break;

            case "Sabado":
                System.out.println("Hoy es sabado");
            break;

            case "Domingo":
                System.out.println("Hoy es domingo");
            break;

            default:
                System.out.println("Error dia no encontrado");
        }

    }

}
