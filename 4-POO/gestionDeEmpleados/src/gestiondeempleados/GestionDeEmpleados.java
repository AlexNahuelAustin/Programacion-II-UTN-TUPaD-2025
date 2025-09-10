package gestiondeempleados;

public class GestionDeEmpleados {

    public static void main(String[] args) {
        // Formamos cada objeto y sus atributos del primer constructor
        Empleado empleado1 = new Empleado(01, "alex Austin", "Orador", 1550);
        Empleado empleado2 = new Empleado(02, "Cristian Horner", "Jefe de aerodinamica", 2500);
        Empleado empleado3 = new Empleado(03, "Javier olai", "Director de prensa", 1900);
        Empleado empleado4 = new Empleado(04, "Marcus", "CEO", 50000);
        Empleado empleado5 = new Empleado(05, "juan calvan", "Motorista", 10000);

        // Mostramos por consola el primero costructor
        System.out.println("-------------PRIMER CONSTRUCTOR-------------");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println(empleado5);

        // Formamos cada objeto y sus atributos del segundo constructor
        Empleado empleado6 = new Empleado("juan Perez", "Marketing");
        Empleado empleado7 = new Empleado("Maximiliano Dior", "Departamente de Resistencia");
        Empleado empleado8 = new Empleado("Zack Brown", "Jefe Ingeniero de estrategia");
        Empleado empleado9 = new Empleado("matul Suar", "Departamento Electrico");
        Empleado empleado10 = new Empleado("Jhon Struart", "Piloto");

        // Mostramos por consola el segundo costructor
        System.out.println("-------------SEGUNDO CONSTRUCTOR-------------");
        System.out.println(empleado6);
        System.out.println(empleado7);
        System.out.println(empleado8);
        System.out.println(empleado9);
        System.out.println(empleado10);

        //mostramos por consola los aumentos en porcentaje.
        System.out.println("---PORCENTAJE DE AUMENTO SALARIAL---");
        System.out.println(empleado1.actualizarSalario(25));
        System.out.println(empleado2.actualizarSalario(16.8));
        System.out.println(empleado3.actualizarSalario(13.5));
        System.out.println(empleado4.actualizarSalario(3.85));
        System.out.println(empleado5.actualizarSalario(7));

        //mostramos por consola los aumentos fijos.
        System.out.println("---DE AUMENTO SALARIAL---");
        System.out.println(empleado6.actualizarSalario(2500));
        System.out.println(empleado7.actualizarSalario(1568));
        System.out.println(empleado8.actualizarSalario(750));
        System.out.println(empleado9.actualizarSalario(1000));
        System.out.println(empleado10.actualizarSalario(750));

        // Mostramos el total de empleados
        System.out.println("El total de empleado son: " + Empleado.getTotalEmpleados());

    }

}
