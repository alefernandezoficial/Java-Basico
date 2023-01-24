package com.javabasic.poo.herencias;

import com.javabasic.poo.clases.Motor;
import com.javabasic.poo.clases.Vehiculo;


/**
 * 
 *      Clase derivada o clase hija o subclase
 * 
 */
public class Motocicleta extends Vehiculo{
    
    boolean baul;

    public Motocicleta(){
        
    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor,
            boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
    
}
