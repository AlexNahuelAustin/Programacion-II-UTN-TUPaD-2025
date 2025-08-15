package ejercicio10;

/*
    10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
 */
import java.util.Scanner;

public class Ejercicio10 {

    //creamos el metodo para la actualizacion del stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        // Importamos el metodo Scanner.
        Scanner teclado = new Scanner(System.in);

        //declamos las variables
        int stock_actual, cant_vendida, cant_recibida;
        int stock_actualizado;

// 1. Solicitamos los datos al usuario.
        System.out.println("Ingrese el stock actual del producto:");
        stock_actual = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la cantidad de productos vendidos:");
        cant_vendida = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la cantidad de productos recibidos:");
        cant_recibida = Integer.parseInt(teclado.nextLine());

        // Llamamos al metodo para saber la nueva cantidad.
        stock_actualizado = actualizarStock(stock_actual, cant_vendida, cant_recibida);

        //mostramos por consolas los datos
        System.out.println("---------------------------");
        System.out.println("El stock actual es: " + stock_actual);
        System.out.println("El stock vendido fue de : " + cant_vendida);
        System.out.println("El stock recibido fue de: " + cant_recibida);
        System.out.println("---------------------------");
        System.out.println("El stock actualizado es de: " + stock_actualizado);

    }

}
