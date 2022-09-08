package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();
// aqui estariamos aplicando polimorfisco sobre interfaces en donde "CocheService" funciona como una clase base con
// la diferencia de que no tiene cuerpo, no aplica metodos solo tiene la declaracion de la clase sobre la que
// se pueden crear objetos

        Coche coche1 = service1.crearCocheDemo();

        Coche coche2 = service2.crearCocheDemo();


    }
}
