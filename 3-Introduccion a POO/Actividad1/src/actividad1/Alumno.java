package actividad1;

public class Alumno {

   String nombre; 
   String apellido;
   String curso;
   double calificacion;
    
   public Alumno(){
       
   }

    public void motrarInfo (String nombre,String apellido,String curso, double calificacion){
       System.out.println("----------------- Informacion del estudiante -----------------");
       System.out.println("Nombre: " + nombre + "\nApellido: " + apellido  + "\nCurso: " + curso + "\naCalificacion: " + calificacion);
       
   }
    
    public void subirCalificacion(double calificacion){
        this.calificacion += calificacion;
        
    }
    
    
    
    
    
    
    
    
    
}
