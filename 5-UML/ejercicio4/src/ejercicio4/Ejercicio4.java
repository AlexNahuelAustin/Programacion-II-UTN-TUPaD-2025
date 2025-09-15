package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Formamos los objetos
        Banco bank1 = new Banco(" Banco.RIO pinto ", "2942220001");
        Cliente cliente1 = new Cliente("Alex Austin", 422209);
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4500 1515 8989 4441", "07/2025", bank1);
        
        // usamos setter para unir
        tarjeta1.setCliente(cliente1);
        
        System.out.println(tarjeta1);
    }

}
