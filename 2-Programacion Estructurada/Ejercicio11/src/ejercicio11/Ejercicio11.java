package ejercicio11;

import java.util.Scanner;

/*
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.

 */
public class Ejercicio11 {

    //metodo para el descuento
    public static final double DESCUENTO_ESPECIAL = 10;

    // metodo para sacar el precio final
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio - (precio * (DESCUENTO_ESPECIAL / 100));
        return descuentoAplicado;
    }

    public static void main(String[] args) {
        //importamos el scanner
        Scanner teclado = new Scanner(System.in);
        // declaramos una variable
        double precio_base, precio_con_descuento;

        //pedimos por consola el precio
        System.out.println("ingrese el precio del producto: ");
        precio_base = Double.parseDouble(teclado.nextLine());

        //llamamos al metodo
        precio_con_descuento = calcularDescuentoEspecial(precio_base);

        //mostramos por consola el descuento
        System.out.println("El descuento total es de: " + precio_con_descuento);

    }

}
