package ejercicio12;

public class Impuesto {

    // Declaramos los atributos
    private double monto;
    private Contribuyente persona;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getPersona() {
        return persona;
    }

    public void setPersona(Contribuyente persona) {
        this.persona = persona;
    }

}
