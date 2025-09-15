
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Decalaramos el objeto con sus atributos.
   Pasaporte pasaporte1 = new Pasaporte("1200", "17/01/2022", "foto carnet", "PNG");
   Titular persona1 = new Titular("Alex Austin", 42209093, pasaporte1);
   Pasaporte pasaporte2 = new Pasaporte("1254", "09/10/2021", "foto carnet", "JPG");
   Titular persona2 = new Titular("Joaquin levin", 15459093, pasaporte1);
   Pasaporte pasaporte3 = new Pasaporte("789", "29/05/2009", "foto carnet", "PNG");
   Titular persona3 = new Titular("Alex Austin", 40211000, pasaporte1);
        
   // Mostramos por consola los datos
        System.out.println(persona1);
        System.out.println(" ");
        System.out.println(persona2);
        System.out.println(" ");
        System.out.println(persona3);
    }
}
