package ejercicio12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        if (impuesto.getPersona() != null) {
            System.out.println("---------------------------");
            System.out.println("Nombre: " + impuesto.getPersona().getNombre());
            System.out.println("Cuil: " + impuesto.getPersona().getCuil());
            System.out.println("Calculando impuesto a pagar...");
            System.out.println("Monto a pagar de impuesto: " + impuesto.getMonto());
            System.out.println("---------------------------");
        }
    }
}
