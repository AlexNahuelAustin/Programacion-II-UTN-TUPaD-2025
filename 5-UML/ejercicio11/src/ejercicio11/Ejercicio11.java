package ejercicio11;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        // 
        Cancion cancion1 = new Cancion("No. 1 Party Anthem");
        Artista artista1 = new Artista(" Arctic Monkeys ", "rock clásico y a R&B");
        Reproductor reproductor = new Reproductor();

        // Usamos setter para unir
        cancion1.setArtista(artista1);

        // Mostramos por consola
        reproductor.reproducir(cancion1);
        
    }
    
}
