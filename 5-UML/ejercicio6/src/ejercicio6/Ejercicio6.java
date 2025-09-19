package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Formamos los objetos
        Mesa mesa1 = new Mesa(04, 4);
        Cliente cliente1 = new Cliente("Juan Gabriel", "345177790");
        Reserva reserva1 = new Reserva("25/11/2025", "19:00 hs", mesa1);

        Mesa mesa2 = new Mesa(14, 3);
        Cliente cliente2 = new Cliente("Matias Perez", "1198777540");
        Reserva reserva2 = new Reserva("29/11/2025", "20:30 hs", mesa2);

        Mesa mesa3 = new Mesa(01, 7);
        Cliente cliente3 = new Cliente("Ezequiel  Binotto", "3541699021");
        Reserva reserva3 = new Reserva("04/12/2025", "21:00 hs", mesa3);

        // usamos el seter para unir
        reserva1.setCliente(cliente1);
        reserva2.setCliente(cliente2);
        reserva3.setCliente(cliente3);
        
        //mostramos por consola
        System.out.println(reserva1);
        System.out.println(" ");
        System.out.println(reserva2);
        System.out.println(" ");
        System.out.println(reserva3);

    }

}
