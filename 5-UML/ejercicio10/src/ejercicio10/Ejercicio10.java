package ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {
        //Construimos los objetos
        Titutar titutar1 = new Titutar("Alex Austin", 40054001);
        CuentaBancaria cuenta1 = new CuentaBancaria("1200001", 150000, "4550", "07/052025");

        //usamos setterm para mostrar por consola
        cuenta1.setTitutar(titutar1);

        //Mostramos por consola
        System.out.println(cuenta1);
    }

}
