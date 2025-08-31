package actividad1;

import java.util.Scanner;

public class Alumno {
    Scanner teclado = new Scanner(System.in);
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
    
    public double subirCalificacion(double puntoExtra){
        puntoExtra = Double.parseDouble(teclado.nextLine());
        calificacion += puntoExtra;
      return calificacion;
        
    }
    
    
    
    
    
    
    
    
    
}
