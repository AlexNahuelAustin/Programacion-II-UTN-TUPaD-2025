package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
*Menor de 12 años: "Niño"
*Entre 12 y 17 años: "Adolescente"
*Entre 18 y 59 años: "Adulto"
*60 años o más: "Adulto mayor"

     */
    public static void main(String[] args) {
        // Importamos al metodo Scanner.
        Scanner teclado = new Scanner(System.in);

        //declaramos la variable edad
        int edad;

        // ingresamos la edad por consola.
        System.out.println("Ingrese su edad y vea su etapa que se encuentra ");
        edad = Integer.parseInt(teclado.nextLine());

        // usamos un if y comparar la edad y poder determina que etapa se encuentra
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un adolocente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
