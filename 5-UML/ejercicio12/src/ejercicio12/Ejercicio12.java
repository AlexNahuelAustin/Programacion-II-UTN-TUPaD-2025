package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        
    // Construimos las clases
        Contribuyente persona1 = new Contribuyente("Alex Austin", "20-45555001-3");
        Impuesto imp = new Impuesto(54400.51);
        Calculadora calcular = new Calculadora();
        
        // Usamos un stter para unir
        imp.setPersona(persona1);
        
        // Mostramos por consola
       calcular.calcular(imp);
        
    }

}
