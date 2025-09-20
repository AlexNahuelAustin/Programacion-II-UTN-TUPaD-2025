
package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Formamos los atributos
        Paciente paciente1 = new Paciente("Mariano Perez", "Apross");
        Profesional medico1 = new Profesional("Alex Austin", "Cardiologo");
        CitaMedica cita1 = new CitaMedica("25/09/2025", "19:00 hs");
        Paciente paciente2 = new Paciente("Matias Biassuto", "Propip");
        Profesional medico2 = new Profesional("Marina Soliz", "Traumatologo");
        CitaMedica cita2 = new CitaMedica("29/06/2025", "10:30hs");
        
        // usamos setter para mostrar todo junto por consola.
        cita1.setProfesional(medico1).setPaciente(paciente1);
        cita2.setProfesional(medico2).setPaciente(paciente2);
       
        // Mostramos por consola
        System.out.println(cita1);
        System.out.println("");
        System.out.println(cita2);
    }
    
}
