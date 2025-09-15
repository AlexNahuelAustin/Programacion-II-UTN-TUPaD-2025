package ejercicio1;

public class Foto {
    
//Declaramos los atributos de las clases
    private String imagen;
    private String formato;

    // Contruimos el constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

}
