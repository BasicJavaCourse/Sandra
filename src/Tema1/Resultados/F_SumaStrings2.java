package Tema1.Resultados;
import java.util.Scanner;

/*

 Escribe un Programa en el que entres 2 palabras y las muestre separadas por un espacio

 por ejemplo:

 variables  -> HOLA y ADIOS
 Resultados -> HOLA ADIOS

*/


public class F_SumaStrings2 {

    public static void main(String[] args) {

        Scanner capt = new Scanner(System.in);
        String a = capt.nextLine();
        Scanner capt2 = new Scanner(System.in);
        String b = capt2.nextLine();
        System.out.println(a + " " + b);

    }

}
