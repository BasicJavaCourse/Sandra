package Tema1.Resultados;

/*

 Escribe un Programa en el que entres dos numeros y los sume, los reste, los multiplique y los divida (con resto)

 por ejemplo:

 variables  -> 10 y 5
 Resultados -> 15, 5, 50, 2, 0

*/


import java.util.Scanner;

public class E_OperacionesMates2 {

    public static void mai10n(String[] args) {

        Scanner capt = new Scanner(System.in);
        int a = capt.nextInt();
        Scanner capt2 = new Scanner(System.in);
        int b = capt2.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println("Resultados: " + c + " " + d + " " + e + " " + f + " " + g);

    }

}
