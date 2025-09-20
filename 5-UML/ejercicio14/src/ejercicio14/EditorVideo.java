package ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render forma = new Render(formato, proyecto);
        if (forma.getProyecto() != null) {
            System.out.println("----------PROYECTO----------");
            System.out.println("Nombre: " + forma.getProyecto().getNombre());
            System.out.println("Duracion: " + forma.getProyecto().getDuracionMin());
            System.out.println("----------FORMATO----------");
            System.out.println("Formato: " + forma.getFormato());
        }

    }
}
