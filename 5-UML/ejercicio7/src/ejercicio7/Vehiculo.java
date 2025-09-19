package ejercicio7;

public class Vehiculo {

    //Declaramos los atributos
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", conductor=" + conductor + ", motor=" + motor + '}';
    }

}
