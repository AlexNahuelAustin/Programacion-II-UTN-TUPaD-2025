
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Armamos los objetos
        Conductor conductor1 = new Conductor("Jeremias Alonzo", "A01");
        Motor motor1 = new Motor("V8", "Z2100a");
        Vehiculo vehiculo1 = new Vehiculo("ASW112", "Fiesta", motor1);
        
        // usamos un setter para unir 
        vehiculo1.setConductor(conductor1);
        
        // Mostramos por consola
        System.out.println(vehiculo1);
    }
    
}
