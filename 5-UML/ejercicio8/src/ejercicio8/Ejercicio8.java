package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Juan Perez", "perjuan12@gmail.com");
        Documento doc1 = new Documento("Fecundacion", "Tipos de fecundacion", "e3b0c44", "19/07/2005", user1);

        System.out.println(doc1);
    }

}
