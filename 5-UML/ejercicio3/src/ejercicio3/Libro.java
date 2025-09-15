package ejercicio3;

import ejercicio3.Editorial;

public class Libro {

//Declaramos los atributos
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    //construimos el constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    // Método setter para asociar 
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
