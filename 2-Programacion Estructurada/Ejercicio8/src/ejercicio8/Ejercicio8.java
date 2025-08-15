package ejercicio8;
/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. 
La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.

 */
import java.util.Scanner;


public class Ejercicio8 {

    static double precio_base;

    public static double PRECIO_FINAL(double impuesto, double descuento) {

        return precio_base + (precio_base * (impuesto / 100) - (precio_base * (descuento / 100)));
    }

    public static void main(String[] args) {
        // Importamos el metodo Scanner
        Scanner teclado = new Scanner(System.in);

        //declaramos las variables.
        double IVA, descuento, precio_final;

        //pedimos al usuario el precio del producto.
        System.out.println("Ingrese el precio del producto: ");
        precio_base = Double.parseDouble(teclado.nextLine());

        //pedimos el impuesto al usuario
        System.out.println("Ingrese el IVA: ");
        IVA = Double.parseDouble(teclado.nextLine());

        //pedimos el descuento del pruducto
        System.out.println("Ingrese el descuento del producto: ");
        descuento = Double.parseDouble(teclado.nextLine());

        // Llamamos al metodo para sacar el precio final
        precio_final = PRECIO_FINAL(IVA, descuento);

        System.out.println("----------------------------------");
        System.out.println("El valor del producto base es de: " + precio_base);
        System.out.println("El IVA nacional es de: " + IVA);
        System.out.println("El descuento es de: " + descuento);
        System.out.println("----------------------------------");
        System.out.println("El precio total a pagar es de: " + precio_final);

    }

}
