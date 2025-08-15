package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.

     */
    public static void main(String[] args) {
        // Importamos el metodo Scanner.
        Scanner teclado = new Scanner(System.in);

        // Declaramos las variables.
        int numero, positivo = 0, negativo = 0, cero = 0;

        // Pedimos numero por consola
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(teclado.nextLine());

        //usamos el for para interar el contador.
        for (int i = 0; i < 10; i++) {
            if (numero > 0) {
                positivo++;
            } else if (numero < 0) {
                negativo++;
            } else {
                cero++;
            }
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(teclado.nextLine());
        }

        //mostramos por consola 
        System.out.println("la cantidad de numero positivo son: " + positivo);
        System.out.println("la cantidad de numero negativo son: " + negativo);
        System.out.println("la cantidad de numero creos son: " + cero);

    }

}
