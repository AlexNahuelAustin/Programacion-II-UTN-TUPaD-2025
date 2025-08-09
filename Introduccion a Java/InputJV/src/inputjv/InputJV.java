
package inputjv;

import java.util.Scanner;


public class InputJV {

    
    public static void main(String[] args) {
        // Pedir datos por consola
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        
        System.out.println("Ingrese tu edad: ");
        edad = input.nextInt();
        
        

    }
    
}
