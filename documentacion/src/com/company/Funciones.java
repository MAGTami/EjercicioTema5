package com.company;


import javax.xml.namespace.QName;

public class Funciones {


    public static void main(String[] args) {
        holaMundo();
        holaMundo();
// cuando no queramos ejecutar una parte del codigo en concreto podemos marcarla como "comentario"
        //holaMundo("Miguel");
        //holaMundo("Roberto");   //podemos agregar tantas variables con argumentos diferentes
        // como queramos para que al ejecutar la funcion todas se ejecuten

        String hola = devolverHola();
        System.out.println(hola);
    }
// Funciones: las llamaremos asi cuando no estemos programando de forma orientada a objetos
// Metodos: llamaremos asi a las funciones cuando estamos programando orientados a objetos

    public static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    /* cuando en el ejemplo de abajo el contenido del parentesis son valores que enviamos a la funcion se le llaman parametros
    Si lo que lleva dentro los parentesis son los datos que recibe se le llama "argumento" de la funcion,
    arriba en el holaMundo/ name:"Miguel")
    en el contexto de este ejercicio parametro es equivalente a argumento

     */
    private static void holaMundo(String name) {
        System.out.println("Hola " + name);

        /*usando el operador + podemos concatenar el argumento "Hola + name" con la variable "string name"
        de la clase arriba donde indicamos el tipo de dato con elque estanmos trabajando
         */
    }
    /* el modificador "static" indica que esa funcion pertenece a la clase "main" que van a poder ser ejecutados sin
    la necesidad de crear un objeto que derive de la clase main el modificador de visibilidad puede permitir que un
    segmento de mi codigo sea privado, publico o protegido. Si es publico podremos acceder a el desde otra clase
    fuera de la clase en la que trabajo incluso en otra clase principal (otro archivo java diferente) dentro del
    mismo paquete
     */

    /* al ejecutar la funcion que invoca 2 veces mi "holaMundo()" el resultado es 4 veces proyectado por pantalla
    "Hola mundo" porque se repite 2 veces la orden ya que hay 2 ordenes de print
     */
    private static String devolverHola() {
        return "Hola";
    }

/* Retorno de dato: quitamos el void y cambiamos el tipo de dato por String.
para devolver algo usamos la palabra reservada "return"
Para que esto se vea asignamos "hola" a una variable y pedimos imprimirla
 */

/* La gran ventaja de las funciones es que vamos a poder replicar el contenido o las acciones de las mismas todo lo
que queramos sin duplicar el codigo lo cual es una buena practica y se puede utilizar desde varios puntos de la
aplicacion es decir desde varios archivos java
 */

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}