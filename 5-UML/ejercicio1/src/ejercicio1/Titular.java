package ejercicio1;

public class Titular {

    // Declaramos los atributos de las clases
    private String nombre;
    private int DNI;
    private Pasaporte pasaporte;

    // Contruimos el constructor
    public Titular(String nombre, int DNI, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.pasaporte = pasaporte;
    }

    
   
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + ", pasaporte=" + pasaporte + '}';
    }

}
