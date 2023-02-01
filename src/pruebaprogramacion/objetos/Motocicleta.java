package pruebaprogramacion.objetos;

public class Motocicleta {
    
    protected String fabricante;
    protected String modelo;
    protected int year;
    protected double precio;
    protected int speed;

    public Motocicleta(String fabricante, String modelo, int year, double precio, int speed){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.speed = speed;
    }

    public Motocicleta() {
    }

    public void acelerar(int quantity) {
        this.speed += quantity;
    }
}
