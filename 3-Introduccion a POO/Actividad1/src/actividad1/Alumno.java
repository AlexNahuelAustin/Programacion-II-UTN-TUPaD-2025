package actividad1;

import java.util.Scanner;

public class Alumno {

    Scanner teclado = new Scanner(System.in);
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Alumno() {
    }

    public void setcalificaciones(Scanner teclado) {
        boolean calificacionValida = false;
        while (!calificacionValida) {
            System.out.println("Ingrese la calificacion del 1 a al 10: ");
            calificacion = Double.parseDouble(teclado.nextLine());
        }
    }

    public void motrarInfo(String nombre, String apellido, String curso, double calificacion) {
        System.out.println("----------------- Informacion del estudiante -----------------");
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);

    }

    public double subirCalificacion(double puntoExtra) {
        puntoExtra = Double.parseDouble(teclado.nextLine());
        calificacion += puntoExtra;
        if (calificacion > 10) {
            calificacion = 10;
        }
        return calificacion;
    }

    public double bajarCalificacion(double bajarNota) {
        bajarNota = Double.parseDouble(teclado.nextLine());
        calificacion -= bajarNota;
        if (calificacion <= 0) {
            calificacion = 1;
        }
        return calificacion;

    }

}
