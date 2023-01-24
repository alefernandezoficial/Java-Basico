package com.javabasic;

public class Funciones {
    public static void main(String[] args) {

        // Opcion 1: funcion sin parametros y SIN tipo de retorno
        showMenu();
        showMenu();


        // Opcion2: funcion sin parametros y CON tipo de retorno


    }
/**
 *      void indica que no devuelve ningun dato
 */
    static void showMenu(){
        System.out.println("Bienvenido Jugador");
        System.out.println("1- Seleccionar inventario");
        System.out.println("2- Depositar COINS");
        System.out.println("3- Exit");
    }

    static void getMenu(){}
}
