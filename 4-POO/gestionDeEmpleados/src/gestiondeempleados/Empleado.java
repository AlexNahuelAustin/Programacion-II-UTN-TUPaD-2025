package gestiondeempleados;

public class Empleado {
// Declaramos los atributo de la clase

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contador = 6;
    // Costruimos los contructores

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public Empleado(String nombre, String puesto) {
        this.id = contador++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 7899.66;
        totalEmpleados++;
    }

    public double actualizarSalario(double porcentaje) {
        this.salario = salario + (salario * porcentaje / 100);
        return salario;
    }

    public double actualizarSalario(int aumento) {
        return this.salario += aumento;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

}
