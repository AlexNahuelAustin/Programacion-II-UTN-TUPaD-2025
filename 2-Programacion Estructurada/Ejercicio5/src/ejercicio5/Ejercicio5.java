package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    5. Suma de Números Pares (while). 
    Escribe un programa que solicite números al usuario y sume solo los números pares. 
    El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.

     */
    public static void main(String[] args) {
        // Importamos el Scanner.
        Scanner teclado = new Scanner(System.in);

        //declaramos las variable.
        int numero, suma = 0;

        //solicitamos a usuario el ingreso de numero para la suma
        System.out.println("Ingrese numero (ingrese 0 para terminar):");
        numero = Integer.parseInt(teclado.nextLine());

        //usamos una estructura while para evaluar si es 0 y if para saber si es par.
        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            } else {
            }
            System.out.println("Ingrese numero para concretar la suma de numero pares:");
            numero = Integer.parseInt(teclado.nextLine());
        }
        
        // mostramos por consola la suma
        System.out.println("La suma de numero pares es: " + suma);

    }

}
