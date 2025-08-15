package ejercicio12;

/**
 * Arrays y Recursividad: 12. Modificación de un array de precios y
 * visualización de resultados. Crea un programa que: a. Declare e inicialice un
 * array con los precios de algunos productos. b. Muestre los valores originales
 * de los precios. c. Modifique el precio de un producto específico. d. Muestre
 * los valores modificados
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        // declaramos la array

        double[] precio = {17, 14.5, 45, 54.5, 199.99, 101, 5};

        // mostramos los precios por consola
        System.out.println("Precios desactualizado");
        for (int i = 0; i < precio.length; i++) {
            System.out.println("precio: $" + precio[i]);

        }
        // Actulizamos los precios
        precio[0] = 20;
        precio[2] = 50.5;
        precio[6] = 10;

        // Mostramos los precio actualizados
        System.out.println("Precios desactualizado");
        for (int i = 0; i < precio.length; i++) {
            System.out.println("precio: $" + precio[i]);

        }
    }

}
