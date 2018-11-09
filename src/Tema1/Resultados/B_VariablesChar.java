package Tema1.Resultados;
import java.util.Scanner;

/*

 Escribe un Programa en el que introduzcas una letra por teclado y te lo muestre

*/



public class B_VariablesChar {

    public static void main(String[] args) {

        Scanner capt = new Scanner(System.in);
        char a = capt.nextLine().charAt(0);
        System.out.print(a);

    }

}
