package Tema1.Resultados;
import java.util.Scanner;

/*

 Escribe un Programa en el que entres 2 numeros y te diga si son iguales o diferentes

 por ejemplo:

 variables  -> 5 y 5
 Resultados -> Iguales

 variables  -> 6 y 5
 Resultados -> Diferentes

*/

public class G_NumerosIguales {

    public static void main(String[] args) {

        Scanner capt = new Scanner(System.in);
        int a = capt.nextInt();
        Scanner capt2 = new Scanner(System.in);
        int b = capt.nextInt();

        if(a == b) {
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }

    }

}
