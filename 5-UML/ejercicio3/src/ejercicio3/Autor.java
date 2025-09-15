package ejercicio3;

public class Autor {
    
//Declaramos los atributos
    private String autor;
    private String nacionalidad;

    //construimos el constructor
    public Autor(String autor, String nacionalidad) {
        this.autor = autor;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "autor=" + autor + ", nacionalidad=" + nacionalidad + '}';
    }

}
