package ejercicio5;


public class Ejercicio5 {

    public static void main(String[] args) {
        Propietario persona1 = new Propietario("Alex Austin", 48777900);
        Computadora compu1 = new Computadora("Asus", "0001212", "MSI B650", "A15555");
        
        //setter para unir
        compu1.setPropietario(persona1);
        // Mostrmoas por consola
        System.out.println(compu1);
    }

}
