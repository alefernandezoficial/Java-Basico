package com.javabasic;

public class Funciones {
    public static void main(String[] args) {

        // Opcion 1: funcion sin parametros y SIN tipo de retorno.
        //showMenu();
        //showMenu();

        // Opcion 2: funcion sin parametros y CON tipo de retorno.
        String menu = getMenu();
        System.out.println(menu); // getMenu();

        double coins = getCOINS();
        System.out.println(coins);

        // Opcion 3: funcion con parametros y SIN tipo de retorno.
        imprimirSaludoBuenosDias("EntryFragger");

        // Opcion 4: funcion con parametros y CON tipo de retorno.
        String apellido = "Fernandez";
        String nombre = "Alejandro";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

    }

    static String obtenerSaludo(String nombre, String apellido){
        return "Wellcome " + nombre + " , " + apellido;

    }

    static void imprimirSaludoBuenosDias(String roll){
        System.out.println("Jugador " + roll);
    }

    static double getCOINS() {
        return 99.23;
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

    static String getMenu(){
        return "Bienvenido jugador: \n 1- Seleccionar...";
    }
}
