package ejercicio10;

public class Titutar {

    private String nombre;
    private int DNI;
    private CuentaBancaria cuenta;

    public Titutar(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titutar{" + "nombre=" + nombre + ", DNI=" + DNI + ", cuenta=" + cuenta + '}';
    }

}
