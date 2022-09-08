package com.company;

public class Tipos {

    //tipos primitivos (no pueden ser nulos)

    public static void Main(String[] args) {
        // tipo identificador = 30;
        // tipo identificador;
        // identificador = 30;

        //enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte // igual que long
        long number4 = 4; // 8 byte //numeros de mayor capacidad, los ideales para identificadores o claves primarias
        // a nivel de bases de datos

        // punto flotante
        float decimal1 = 4.9f;
        double decimal2 = 9.99; // o puede ser 9.99d, tambien este tiene mas capacidad que el float

        // caracter
        char caracter1 = 'a';

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        // ya no son primitivos de aqui en adelante

        // cadenas de texto // son un tipo especial porque implica usar una clase
        String nombre = "Miguel";
        String apellido = "Gutierrez";

        // tipos envoltorio // se pueden iniciar en mayusculas, funcionan como clases, pueden envolver
        // a los tipos primitivos y pueden ser nulos

        Integer numero = null;
        Long numero2 = 2L;

        //PALABRAS RESERVADAS
        /* son las palabras que se indican con un color diferente al de los identificadores, normalmente colores vivos
        para saber que palabras reservadas no podemos utilizar podemos verlo en el mismo codigo que nos lo dira
        intelliJ mostrando un error
        igualmente tambien se pueden buscar cuales palabras reservadas no podemos utilizar en un explorador como
         "java keywords" esto nos envia a ua pagina de oracle que nos genera un listado de palabras reservadas que
          no podenos utilizar como identificadores
         */

        //Lo que buscaremos es siempre poner identificadores que sean significativos, palabras que cumplan con
        // cierta nomenclatura

        int numeroTelefono = 333_552_255;

         // los identificadores de variables siempre deben comenzar con minusculas, si tiene 2 palabras escribirlas
        // de seguido y la siguiente palabra si inicia en mayuscula
        // los nombres de las clases siempre deben iniciar en mayusculas








    }
}
