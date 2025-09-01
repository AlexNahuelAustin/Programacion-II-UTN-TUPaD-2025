package actividad3;

public class Actividad3 {

    /* 
     3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.

     */
    public static void main(String[] args) {
        //declaramos el objeto
        Libro libro1 = new Libro("El mentalista", "Jhon Mayer", 2007);
        // Msotramos por cosola los datos
        libro1.mostrarInfo();
        System.out.println("-----------------------------------------------");

        //moficamos un año invalido
        libro1.setAnioPublicacion(3500);
        libro1.mostrarInfo();

        // pasamos un años valido
        System.out.println("-----------------------------------------------");
        libro1.setAnioPublicacion(2009);
        libro1.mostrarInfo();
    }

}
