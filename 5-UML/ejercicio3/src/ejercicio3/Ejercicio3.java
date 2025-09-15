package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Creamos los objetos
        Autor autor1 = new Autor("Gustavo Cervante", "Español");
        Editorial editorial1 = new Editorial("Planeta", "martin Fierro 123");
        Libro libro1 = new Libro("El Chacal","A101", editorial1);
        
        // Usamos el setter para asociar el autor
        libro1.setAutor(autor1);
      // Mostramos por consola
        System.out.println(libro1);
    }

}
