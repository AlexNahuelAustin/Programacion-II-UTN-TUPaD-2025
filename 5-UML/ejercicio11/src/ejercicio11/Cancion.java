package ejercicio11;

public class Cancion {

    // Declaramos los atributos
    private Artista artista;
    private String titulo;

    public Cancion(String cancion) {
        this.titulo = cancion;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

}
