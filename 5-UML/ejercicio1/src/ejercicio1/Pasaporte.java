package ejercicio1;

public class Pasaporte {
    
//Declaramos los atributos de las clases
    private String numero;
    private String fechaEmision;
    private Foto foto;
    
    // Contruimos el constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(numero, numero);
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero
                + ", fechaEmision=" + fechaEmision + ", foto=" + foto + '}';
    }

}
