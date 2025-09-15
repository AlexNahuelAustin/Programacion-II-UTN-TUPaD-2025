package ejercicio2;

public class Usuario {

    // Declaramos los atributos
    private String nombre;
    private int DNI;
    private Celular celular;

    public Usuario(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }

}
