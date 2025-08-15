package ejercicio13;

/**
 * 13. Impresión recursiva de arrays antes y después de modificar un elemento.
 * Crea un programa que: a. Declare e inicialice un array con los precios de
 * algunos productos. b. Use una función recursiva para mostrar los precios
 * originales. c. Modifique el precio de un producto específico. d. Use otra
 * función recursiva para mostrar los valores modificados.
 *
 */
public class Ejercicio13 {
//metodo recursivo para el array

    public static void precio_recu_(double[] precio, int indice) {
        // Caso Base: Si el índice es igual o mayor al tamaño del array, la recursión termina.
        if (indice >= precio.length) {
            return;
        }
        //Imprime el elemento actual.
        System.out.println("Precio: $" + precio[indice]);

        // Llama al mismo método para el siguiente elemento.
        precio_recu_(precio, indice + 1);
    }

    public static void main(String[] args) {
        // declaramos la array
        double[] precio = {50, 155.5, 112, 25, 45, 15.6, 156.8, 100.80, 455};

        System.out.println("-------- Precios Originales --------");
        //Usa la función recursiva para mostrar los precios originales.
        precio_recu_(precio, 0);

        //Modifica el precio de un producto específico 
        precio[2] = 49.5;
        precio[0] = 49.5;
        precio[6] = 160;

        System.out.println("\n------ Precios Modificados -------");
        //Usa la misma función recursiva para mostrar los valores modificados.
        precio_recu_(precio, 0);

    }

}
