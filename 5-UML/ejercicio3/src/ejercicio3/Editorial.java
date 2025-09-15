package ejercicio3;


public class Editorial {
    
    // Declaramos los atributos
    private String nombre;
    private String direccion;

    //construimos el constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }


    
    
}
