package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Creamos los distintos objetos
        Bateria bate1 = new Bateria("FR1", "1220mAh");
        Usuario user1 = new Usuario("Alex Austin", 4255200);
        Celular celu1 = new Celular("A501", "samsom", "w12", bate1, user1);
        Bateria bate2 = new Bateria("FQ001", "2250mAh");
        Usuario user2 = new Usuario("Matias Gonzales", 1200290);
        Celular celu2 = new Celular("Z01", "Sonic", "Xperia x9", bate1, user1);
        Bateria bate3 = new Bateria("FR1", "3000mAh");
        Usuario user3 = new Usuario("Zoe Schumager", 4505299);
        Celular celu3 = new Celular("A501", "samsom", "QW1", bate1, user1);

        // Mostramo por consola 
        System.out.println(celu1);
        System.out.println(" ");
        System.out.println(celu2);
        System.out.println(" ");
        System.out.println(celu3);
    }

}
