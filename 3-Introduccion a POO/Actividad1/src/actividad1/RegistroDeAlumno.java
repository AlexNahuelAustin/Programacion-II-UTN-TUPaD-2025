package actividad1;

import java.util.Scanner;

public class RegistroDeAlumno {

    /*
Registro de Estudiantes 
    a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //declamos el objeto y pedimos los datos por teclado
        Alumno alum1 = new Alumno();
        System.out.println("Ingrese el nombre del estudiante: ");
        alum1.nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del estudiante: ");
        alum1.apellido = teclado.nextLine();
        System.out.println("Ingrese el el curso del estudiante: ");
        alum1.curso = teclado.nextLine();
        System.out.println("Ingrese la calificacion del 1 al 10 del estudiante: ");
        alum1.calificacion = Double.parseDouble(teclado.nextLine());
        // mostramos por consola los datos del estudiante
        alum1.motrarInfo(alum1.nombre, alum1.apellido, alum1.curso, alum1.calificacion);
        
        //pedimos los puntos extra del estudiante
        System.out.println("-------puntos extras----------");
        System.out.println("Ingrese los puntos extra del estudiante: " );
        alum1.subirCalificacion(alum1.calificacion);
         System.out.println("La calificacion del alumno por su puntos extras es: " + alum1.calificacion);
         
        //pedimos la baja de punto del estudiante
        System.out.println("-------baja de puntos----------");
         System.out.println("Ingrese la baja de punto del estudiante: " );
        alum1.bajarCalificacion(alum1.calificacion);
        System.out.println("La calificacion final del alumno: : " + alum1.calificacion);
        
      
        
        
    }

}
