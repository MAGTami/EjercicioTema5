package com.company;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";
        String nombre4 = "nombre 4";

        String[] nombres = new String[4];
        String[] nombres2 = new String[]{ nombre1, nombre2, nombre3, nombre4};
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;


        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
//lo unico que hay que tener en cuenta de los arrays es que son estaticos todo lo que hagamos con ellos debe ser dentro
//de los limites del array

    }
}
