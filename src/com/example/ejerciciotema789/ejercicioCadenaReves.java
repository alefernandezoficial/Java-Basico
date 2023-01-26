package com.example.ejerciciotema789;

import java.util.Scanner;

public class ejercicioCadenaReves {

    public static class CadenaReves {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Cadena al Reves\n--------------------");

            try (Scanner scanner = new Scanner(System.in)) {
                String texto;
                System.out.println("Introduce un texto");
                texto = scanner.nextLine();

                StringBuilder reves = new StringBuilder(texto);
                texto = reves.reverse().toString();

                System.out.println(texto);
            }
        }
    }
}
