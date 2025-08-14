package operacionesarimeticas;

import java.util.Scanner;

public class OperacionesArimeticas {

    public static void main(String[] args) {
        // opreaciones arimeticas
        Scanner input = new Scanner(System.in);

        int num1, num2;
        int multiplicacion, suma, resta, division;

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("El resultado de la suma de: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resltuado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es:" + division);

    }

}
