package ejercicio5;

public class Computadora {
// Declaramos los atributos 

    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);

    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placa=" + placa + ", propietario=" + propietario + '}';
    }

}
