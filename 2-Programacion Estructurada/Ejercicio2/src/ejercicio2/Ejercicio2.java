package ejercicio2;

/*
    Determinar el Mayor de Tres Números. 
    Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Lamamos al metodo Scanner para poder ingresar datos por consola.
        Scanner teclado = new Scanner(System.in);

        // Declaramos las variables 
        int num1, num2, num3, num_mayor;

        // pedimos al usuario el ingreso de tres numero.
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(teclado.nextLine());

        // usamos un if para determinar el numero mas grande
        if (num1 >= num2 && num1 >= num3) {
            num_mayor = num1;
            System.out.println("El numero mas grande es: " + num_mayor);
        } else if (num2 >= num1 && num2 >= num3) {
            num_mayor = num2;
            System.out.println("El numero mas grande es: " + num_mayor);
        } else {
            num_mayor = num3;
            System.out.println("El numero mas grande es: " + num_mayor);
        }

    }

}
