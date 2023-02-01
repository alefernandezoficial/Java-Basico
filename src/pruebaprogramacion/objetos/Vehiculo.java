package pruebaprogramacion.objetos;

public class Vehiculo  {

    protected String fabricante;
    protected String modelo;
    protected int year;
    protected double precio;
    protected int speed;

    public Vehiculo(String fabricante, String modelo, int year, double precio, int speed){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.speed = speed;
    }

    public Vehiculo(){
        
    }

    public void acelerar(int quantity) {
        this.speed += quantity;
    }
}
