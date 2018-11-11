package Tema1.Ejercicios;
import java.util.Scanner;

/*

 Escribe un Programa en el que introduzcas una letra por teclado y te lo muestre

*/


public class B_VariablesChar {

    public static void main(String[] args) {
        //COMO VAMOS A INTRRODUCIR UN CHAR, SE TIENE Q PONER ESTO
        Scanner capt = new Scanner(System.in);
        char a = capt.nextLine().charAt(0);
        //PARA MOSTRAR LO Q INTRODUCES, SE TIENE Q PONER ESTO
        System.out.print(a);
    }

}
