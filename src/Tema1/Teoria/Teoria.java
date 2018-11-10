/*

ENTORNO DE TRABAJO

    1. IntelliJ

        El Intellij es un programa dentro de la categoria IDE (Entorno de desarrollo Integrado), aunque hay otros como
        Netbeans o Eclipse. Es el que usaremos para hacer nuestros programas. La ventaja es que nos permite ejecutar
        nuestros programas directamente en el propio programa. Conforme vayamos avanzando, veremos muchas opciones que tiene.

    2. Git

        Git es un control de versiones. Esto nos permite subir los programas a la nube y bajártelos cuando quieras, además
        de poder ver las versiones anteriores si cambias algun fichero. También está integrado en Intellij, por lo que
        no necesitaremos nada más que Intellij para trabajar.

        Ahora ya estamos listos.

JAVA BASICS

    Vamos a programar en lenguaje Java. Es el más utilizado actualmente y es un lenguaje orientado a objetos. Ya veremos
    más adelante que significa exactamente.

    1. Como se crea un programa nuevo?
        Los programas tienen por lo general esta apariencia:

            package Tema1.Ejercicios;

            public class A_HolaSandra {

                public static void main(String[] args) {
                     PROGRAMA AQUI
                }

            }

        De momento lo unico que nos importa es que siempre tendrán esta apariencia y que lo que nosotros programaremos
        irá donde pone programa aquí.

    2. Variables
        Una variable, es un lugar de memoria del programa donde se guardan datos. de esa manera, si yo guardo la palabra
        "Hola" en una variable llamada var, siempre que use la variable var en el programa, estaré usando la palabra "Hola".
        Esto es útil para introducir datos por pantalla y guardarlos.
        Hay 3 tipos de variables principales que veremos por el momento. int -> numeros, char -> letras, String -> palabras.

    3. Introducir datos por teclado, sacar datos por pantalla

       Introducir
           Scanner capt = new Scanner(System.in);
           int a = capt.nextInt(); String a = capt.nextLine(); char a = capt.nextLine().charAt(0);
       Mostrar
           System.out.print("");

    4. Condicionales

        if (condicion){
        }
        else {
        }

    5. Switch
        switch (variable) {
            case 1:  variable1 = "";
                     break;
            case 2:  variable1 = "";
                     break;
            default:  variable1 = "";
                     break;

     6. Comentarios

        Para añadir comentarios en un codigo (cosas que no se ejecutaran) añadiendo // si es una linea y /*  si
        es mucho texto.

COMPILAR

     Cuando terminamos de programar, ponemos a arrancar el programa para ver si funciona. El punto en el que lo
     escrito en java se convierte en un programa, se llama compilación. Siempre se compila antes de hacer funcionar
     el programa. En este caso Intellij lo hace automáticamente cuando ejecutas el programa. Si no tienes algo bien escrito o
     hay algun error de las normas de programación, el programa da un error y significa que no compila.

DEBUGAR

     Cuando un programa tiene un error que hace que el funcionamiento no sea correcto, se le llama bug (como bicho en ingles)
     hay una opcion, de que en vez de ejecutar un programa, lo puedes poner a debugar. Eso quiere decir que cojes el programa
     le pones un breakpoint (punto de parada) y cuando ejecutas el programa, se para en ese punto y puedes ver lo que se ha hecho
     hasta el momento.

 */
