package pruebaprogramacion.objetos;

public class Main {
    public static void main(String[] args) {
        Vehiculo toyotaSupra = new Vehiculo("Toyota" , "Supra" , 2014 , 42.323 , 0);
        Motocicleta kawasakiGt = new Motocicleta("Kawasaki" , "Ninja" , 2023 , 34.543 , 0);

        // Toyota Supra
        System.out.println("\nToyota Supra Specs: ");
        System.out.println("Fabricante: " + toyotaSupra.fabricante);
        System.out.println("Modelo: " + toyotaSupra.modelo);
        System.out.println("Year: " + toyotaSupra.year);
        System.out.println("Precio: " + toyotaSupra.precio);
        System.out.println("Stand By: " + toyotaSupra.speed + " KM/h");

        toyotaSupra.acelerar(360);
        System.out.println("Aceleramos a: " + toyotaSupra.speed + " KM/h");

        // KawasakiNinja
        System.out.println("\nKawasaki Ninja Specs: ");
        System.out.println("Fabricante: " + kawasakiGt.fabricante);
        System.out.println("Modelo: " + kawasakiGt.modelo);
        System.out.println("Year: " + kawasakiGt.year);
        System.out.println("Precio: " + kawasakiGt.precio);
        System.out.println("Stand By: " + kawasakiGt.speed + " KM/h");

        kawasakiGt.acelerar(380);
        System.out.println("Aceleramos a: " + kawasakiGt.speed + " KM/h");


    }
}
