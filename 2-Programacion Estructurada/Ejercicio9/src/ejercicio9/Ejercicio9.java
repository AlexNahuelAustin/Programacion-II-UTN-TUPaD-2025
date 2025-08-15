package ejercicio9;

import java.util.Scanner;

/*
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
*Nacional: $5 por kg
*Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar
 */
public class Ejercicio9 {
//Usamos un if para saber el tipo de envio y el total a pagar por el envio

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;
        if (zona.equalsIgnoreCase("nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costo = peso * 10;
        } else {
            System.out.println("ERROR.zona no encotrada.");
        }
        return costo;
    }
// calculamos el total a pagar

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        // Importamos el metodo Scanner
        Scanner teclado = new Scanner(System.in);

        //declaramos las varibles
        String zona_envio;
        double peso_paquete, precio_producto;

        // Pedimos la zona de envio.nacion
        System.out.println("Ingrese la zona de envio: nacional o internacional.");
        zona_envio = teclado.nextLine();
        

        //pedimos el peso del paquete.
        System.out.println("Ingrese el peso del paquete");
        peso_paquete = Double.parseDouble(teclado.nextLine());

        //pedimos el precio del producto.
        System.out.println("Ingrese el precio del producto: ");
        precio_producto = Double.parseDouble(teclado.nextLine());

        // 1. Llamamos a calcularCostoEnvio para obtener el costo de envío.
        double costo_envio = calcularCostoEnvio(peso_paquete, zona_envio);

        // 2. Llamamos a calcularTotalCompra para obtener el precio final.
        double precio_final = calcularTotalCompra(precio_producto, costo_envio);

        // Mostramos por consola el resultado
        System.out.println("----------------------------------");
        System.out.println("El precio del producto es: $" + precio_producto);
        System.out.println("El precio del envio es de: $" + costo_envio);
        System.out.println("El precio total apagar es de: " + precio_final);

    }

}
