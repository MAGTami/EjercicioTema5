package poo.ejerciciotema4;

import poo.herenciatema4.SmartPhone;
import poo.herenciatema4.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice laptop1 = new SmartDevice();

        SmartDevice laptop2 = new SmartDevice("windows", "hp", "hp1000", 16,
                500, true, false, 6000, false, false,
                false);
        System.out.println(laptop2.modelo);
        System.out.println(laptop2.sistemaOperativo + " " + laptop2.fabricante + " " + laptop2.modelo);
        System.out.println(" ");


        SmartPhone samsung = new SmartPhone();
        samsung.modelo = "Galaxy 1000";
        samsung.capacidad = 64;
        System.out.println(samsung.modelo + " " + samsung.capacidad + "Gb");

        SmartWatch jogger1 = new SmartWatch("Ios", "apple", "jogger", 8,
                32, false, false, 2500, true, false,
                true);
        jogger1.fabricante = "apple";
        jogger1.sistemaOperativo = "Ios";
        System.out.println(jogger1.fabricante);
        System.out.println(jogger1.sistemaOperativo);


    }
}
