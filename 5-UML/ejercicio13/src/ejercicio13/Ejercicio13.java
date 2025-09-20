package ejercicio13;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        // Creamos el el usuario
        Usuario user1 = new Usuario("Alex Austin", "alexito-1@gmail.com");
        GeneradorQR codigo = new GeneradorQR();

        //Mostramos por consola
        codigo.generar("1500A", user1);
        
    }
    
}
