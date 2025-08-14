package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    4. Calculadora de Descuento según categoría. Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
*Categoría A: 10% de descuento
*Categoría B: 15% de descuento
*Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final

     */
    public static void main(String[] args) {
        // importamos el metodo Scanner 
        Scanner teclado = new Scanner(System.in);

        //declaramos las variables.
        int precio_producto, descuento_A = 10, descuento_B = 15, descuento_C = 20;
        double precio_final, precio_descuento;
        //pedimos al usuario el precio.
        System.out.println("Ingrese el precio del producto: ");
        precio_producto = Integer.parseInt(teclado.nextLine());

        // pedimos al usuario la categoria
        System.out.println("""
                           Ingrese una de estas 3 categoria: 
                           A
                           B
                           C""");
        String categoria = teclado.nextLine();

        //usamos una estructura swich para cada caso
        switch (categoria) {
            case "A" -> {
                precio_descuento = precio_producto * ((double) descuento_A / 100);
                precio_final = precio_producto - precio_descuento;
                System.out.println("------------------------------------");
                System.out.println("El precio original es de: " + precio_producto + "\n El descuento aplicado es de: " + precio_descuento + "\n El precio a pagar es de : " + precio_final);
            }
            case "B" -> {
                precio_descuento = precio_producto * ((double) descuento_B / 100);
                precio_final = precio_producto - precio_descuento;
                System.out.println("------------------------------------");
                System.out.println("El precio original es de: " + precio_producto + "\n El descuento aplicado es de: " + precio_descuento + "\n El precio a pagar es de : " + precio_final);
            }
            case "C" -> {
                precio_descuento = precio_producto * ((double) descuento_C / 100);
                precio_final = precio_producto - precio_descuento;
                System.out.println("------------------------------------");
                System.out.println("El precio original es de: " + precio_producto + "\n El descuento aplicado es de: " + precio_descuento + "\n El precio a pagar es de : " + precio_final);
            }
            default ->
                System.out.println("ERROR. Categoria no encontrada");

        }

    }

}
