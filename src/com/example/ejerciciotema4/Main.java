package com.example.ejerciciotema4;

public class Main{
public static void main(String[] args) {

    SmartPhone smartPhone = new SmartPhone("Samsung", "S10", "Azul", 8, "Android");

    SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "Negro", 3.5, "Bluetooth");

    System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

    }
}