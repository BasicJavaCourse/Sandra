package Tema1.Resultados;

/*

 Escribe un Programa en el que dados dos numeros en dos variables,
 los sume, los reste, los multiplique y los divida (con resto)

 por ejemplo:

 variables  -> 10 y 5
 Resultados -> 15, 5, 50, 2, 0

 */


public class C_OperacionesMates {

    public static void main(String[] args) {

        int b = 5;
        int a = 10;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println("Resultados: " + c + " " + d + " " + e + " " + f + " " + g);
    }

}
