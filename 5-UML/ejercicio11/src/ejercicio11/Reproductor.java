package ejercicio11;

public class Reproductor {

    public void reproducir(Cancion cancion) {
        if (cancion.getArtista() != null) {
            System.out.println("Reproduciendo... " + cancion.getTitulo());
            System.out.println("Artista:" + cancion.getArtista().getNombre());
            System.out.println("Genero" + cancion.getArtista().getGenero());
        } else {
            System.out.println("Cancion no encontrada");
        }

    }

}
