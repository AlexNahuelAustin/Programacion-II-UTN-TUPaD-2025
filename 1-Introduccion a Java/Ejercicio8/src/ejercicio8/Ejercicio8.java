package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Ejercicio 8
        /*Manejar conversiones de tipo y división en Java.
        a. Escribe un programa que divida dos números enteros ingresados por elusuario.
        b. Modifica el código para usar double en lugar de int y compara los esultados
         */

        Scanner input = new Scanner(System.in);

        double num1, num2, division;

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        division = num1 / num2;

        System.out.println("El resultado de la division es: " + division);

    }

}
