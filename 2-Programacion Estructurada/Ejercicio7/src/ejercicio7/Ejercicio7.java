package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    /*
    7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

     */
    public static void main(String[] args) {
        // Importamos el metodo Scanner     
        Scanner teclado = new Scanner(System.in);

        // Declaramos las variables.
        int nota_alumno;

        do {
            // pedimos al usuario la nota.
            System.out.println("Ingrese su nota para ser guardada: ");
            nota_alumno = Integer.parseInt(teclado.nextLine());
            //usamos un if para verificar las notas
            if (nota_alumno > 10 || nota_alumno < 0) {
                System.out.println("ERROR. nota ingresada invalida. Intente nuevamente.");
            }
        } while (nota_alumno > 10 || nota_alumno < 0);

        System.out.println("Nota guardada correctamente: ");

    }

}
