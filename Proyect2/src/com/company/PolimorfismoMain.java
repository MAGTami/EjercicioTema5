package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //polimorfismo // nos permite trabajar con objetos partiendo directamente de la clase superior en vez de usar
        // la clase hija y asi podemos tratar a todos los objetos por igual

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof Coche){  //"instanceof" nos permite comporobar si un objeto pertenece a una clase concreta
            System.out.println("coche");
        }

        if(coche4 instanceof CocheElectrico){
            System.out.println("coche electrico");
        }

        if(coche4 instanceof CocheHibrido){
            System.out.println("coche hibrido");
        }
    }
}
