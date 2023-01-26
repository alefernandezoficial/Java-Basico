package com.example.ejerciciotema789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ejercicioArrayList {

    public static class ArrayString {
//
//      ArrayList tipo String
//
        public static void main(String[] args) {

            System.out.println("-------------------- \n Array y LinkedList\n--------------------");

            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Alejandro");
            lista.add("Alexis");
            lista.add("Roberta");
            lista.add("Lola");

            LinkedList<String> linkedlist = new LinkedList<String>();

            for (int i = 0; i < lista.size(); i++) {
                linkedlist.add(i, lista.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : lista) {
                System.out.print(elementos + " ");
            }

            System.out.println("\n\nElementos de la LinkedList:");
            for (String elementos : linkedlist) {
                System.out.print(elementos + " ");
            }
        }
    }

//
//      ArrayList tipo int
//
    public static class ArrayInt {

        public static void main(String[] args) {

            System.out.println("-------------------- \n ArrayInt\n--------------------");

            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 1; i < 11; i++) {
                lista.add(i);

                for (int num = 0; num < lista.size(); num++) {

                    if (lista.get(num) % 2 == 0) {
                        lista.remove(num);
                    }
                }
            }

            System.out.println(lista);
        }
    }

}
