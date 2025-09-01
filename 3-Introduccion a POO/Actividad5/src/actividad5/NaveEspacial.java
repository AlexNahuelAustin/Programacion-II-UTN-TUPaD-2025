package actividad5;

public class NaveEspacial {
// ponemos los atributos a la nave

    private String nombre;
    private int combustible;
    private final int TANQUE_CAPACIDAD_MAX = 50;
    private int distanciaRecorrida;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;

    }
//metodo para el despege

    public void despegar() {
        if (combustible >= 5) {
            combustible -= 5;
            System.out.println(nombre + " ha despegado. cantidad de combustible restante: " + combustible);
        } else {
            System.out.println(" Cantidad de conbustible insuficiente: ");
        }
    }
//metodo para avanzar

    public void avanzar(int distancia) {
        int consumos = distancia * 2;
        distanciaRecorrida += distancia;
        if (consumos <= combustible) {
            combustible -= consumos;
            System.out.println(nombre + " Recorrio: " + distanciaRecorrida + "Km " + " combustible restante " + combustible);
        } else {
            System.out.println(nombre + " combustible insuficiente " + " distacia recorrida " + distancia + " Km");
        }
    }
// metofdo para recargar combustible

    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) < TANQUE_CAPACIDAD_MAX) {
            combustible += cantidad;
            System.out.println("Se recargaron: " + cantidad + " unidades de combustible. Total: " + combustible);
        } else {
            combustible = TANQUE_CAPACIDAD_MAX;
            System.out.println("Tanque lleno");
        }
    }
// metodo para mostrar el estado de la nave espacial

    public void mostrarEstado() {
        System.out.println("---------------Informacion de la nave espacial---------------");
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("distancia total recorrida: " + distanciaRecorrida + "Km");
        System.out.println("combustible restante: " + combustible);

    }

}
