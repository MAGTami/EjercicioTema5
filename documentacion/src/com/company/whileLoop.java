package com.company;

public class whileLoop {

    public static void main(String[] args) {

        int count = 0;
        while (count < 10){
            count++; //condicion. cuidado con los bucles, si no se acotan con una condicion seran infinitos
            if(count == 6)
                break; //rompe el flujo de ejecucion
                // continue; //salta el valor 6 y continua a la siguiente iteracion

            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
