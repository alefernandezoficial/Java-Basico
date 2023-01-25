package com.javabasic.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *      Create
 *      Retrieve/Read
 *      Update
 *      Delete
 */

public class EmpleadoCRUD {

    // estructuras de datos
    private List<Empleado> empleados = new ArrayList<>();

    // OPERACIONES CRUD.
    // CREATE - guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);

    }

    public List<Empleado>findAll(){
        return empleados;
    }  
}
