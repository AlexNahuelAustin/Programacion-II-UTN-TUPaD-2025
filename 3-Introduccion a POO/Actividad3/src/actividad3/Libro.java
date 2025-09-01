package actividad3;

public class Libro {
    // Nombramos los atributos de la clase
private String Titulo;
private String Autor;
private int anioPublicacion;

    public Libro(String Titulo, String Autor, int anioPublicacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anioPublicacion= anioPublicacion;
    }
    
   
    
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
       int anioactual = 2025;
        if (anioPublicacion > 0 && anioPublicacion <= anioactual) {
            this.anioPublicacion = anioPublicacion;
        }
        else{
            System.out.println("años de publicacion es invalido: " + anioPublicacion);    
        }
    }

    
   public void mostrarInfo(){
       System.out.println("-------------Informacion de libro-------------");
       System.out.println("Titulo: " + Titulo );
       System.out.println("Autor: " + Autor);
       System.out.println("Año de publicacion: " + anioPublicacion);

   }





}
