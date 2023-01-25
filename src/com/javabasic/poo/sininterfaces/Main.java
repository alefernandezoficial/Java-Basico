package com.javabasic.poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado alejandro = new Empleado("Alejandro", 28, 40000, true);
        Empleado alexis = new Empleado("Alexis", 30, 40000, true);
        Empleado roberta = new Empleado("Roberta", 22, 40000, true);
        Empleado lola = new Empleado("Lola", 20, 40000, true);

        // guardar empleados
        empleadoCRUD.save(alejandro);
        empleadoCRUD.save(alexis);
        empleadoCRUD.save(roberta);
        empleadoCRUD.save(lola);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
