package com.company;

public class Operadores {

    public static void main(String[] args) {

        //Operadores

        //aritmeticos

        //+ - / * % // % significa operador "resto"
        int number1 = 5;
        int number2 = 2;

        int resultado = number1 + number2;
        int resultado2 = number1 - number2;
        int resultado3 = number1 * number2;
        int resultado4 = number1 / number2;  //ojo que si en la division puede arrojar decimales y estoy esperando
        // datos int pues los decimales pueden perderse, a lo mejor me interesa utilizar un double u otro tipo de dato

        //Ojo con duplicar las variables, si la linea 16 la hago con el int estaria sobreescribiendo la linea 15
        // que el programa nos indicaria que la linea 15 ya esta definida y que no debemos sobreescribirla
        // por eso hay que eliminar el int o cambiar el nombre de la variable "resultado". Por eso tener en cuenta
        // que si podemos reutilizar variables o si quisieramos podriamos crear una nueva con otro nombre ej
        // "resultado2"

        //logicos, relacion, comparacion, booleanos

        /*
        >
        >=
        <
        <=
        == igual que
        != distinto que
        && and se cumple una condicion Y otra condicion// operador booleano
        !! or se cumple una u otra condicion// operador booleano
        !  negacion, para negar un valor
         */

        // asignacion

        /* hacen una operacion aritmetica y a la vez asignan el resultado sobre una variable
        =
        +=
        -=
        /=
        *=
        %=
         */

        // incremento // usado especialmente en los bucles for, que son estructuras de control que
        // permiten repetir un codigo
        // ++

        //decremento // que seria restar un valor sobre una variable numerica uso igual que ++
        // --

        // concatenacion // cuando trabajamos con strings ya sea para concatenar texto con texto o texto
        // con numero se usa el simbolo +
        // +

    }
}
