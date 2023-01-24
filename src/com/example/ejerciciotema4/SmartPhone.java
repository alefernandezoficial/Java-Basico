package com.example.ejerciciotema4;

public class SmartPhone extends SmartDevice {
    int ram;
    String sistema;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
        super(marca, modelo, color);
        this.ram = ram;
        this.sistema = sistema;

    }

    @Override
    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", ram=" + ram +
                ", sistema=" + sistema;
    }
}
