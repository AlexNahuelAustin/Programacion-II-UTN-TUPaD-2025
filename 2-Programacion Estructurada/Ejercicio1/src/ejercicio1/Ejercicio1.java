package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    /*1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.*/

    public static void main(String[] args) {
        // Lamamos el metodo Scanner para poder ingresar datos por consola.
        Scanner teclado = new Scanner(System.in);
        
        //declaramos las varibles año.
        int anio;
        
        // ingresamos por teclado el año, para saber si es bisiesto.
        System.out.println("Ingrese el año para saber si es bisiesto: ");
        anio = Integer.parseInt(teclado.nextLine());
        
    
        // usamos una estructura if para saber si el año es bisiesto
        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0 )){
            System.out.println("El año ingresado es bisiesto.");
        }
        else{
            System.out.println("el año ingresado no es bisiesto.");
        }
        
        
        
        
        
        
        
        

    }

}
