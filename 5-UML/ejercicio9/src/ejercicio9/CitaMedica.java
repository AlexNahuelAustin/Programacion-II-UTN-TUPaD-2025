package ejercicio9;

public class CitaMedica {

    private Profesional medico;
    private Paciente paciente;
    private String fecha;
    private String hora;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public CitaMedica setProfesional(Profesional profesional) {
        this.medico = profesional;
        return this;
    }

    public CitaMedica setPaciente(Paciente paciente) {
        this.paciente = paciente;
        return this;
    }

    @Override
    public String toString() {
        return """
               CitaMedica{
               medico=""" + medico + ", \npaciente=" + paciente + ", \nfecha=" + fecha + ", \nhora=" + hora + '}';
    }

   

}
