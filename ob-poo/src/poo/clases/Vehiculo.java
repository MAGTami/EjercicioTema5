package poo.clases;

/**
 * Clase base o superclase o clase padre
 */
public class Vehiculo {

    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc; // cuando el tipo esta en mayuscula significa que permite valores nulos
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. constructores  // son funciones publicas que permiten crear objetos
    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    // 3. metodos (comportamiento)
    public void acelerar(int quantity) {
        this.speed += quantity;
    }

    // getter y setter

    // ToString
}

