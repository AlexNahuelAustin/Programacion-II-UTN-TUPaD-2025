package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        // Construimos los objetos
        Proyecto proyecto = new Proyecto("Fecundacion", "25 minutos");
        EditorVideo formato = new EditorVideo();
        
        formato.exportar("MP4", proyecto);
        
    }

}
