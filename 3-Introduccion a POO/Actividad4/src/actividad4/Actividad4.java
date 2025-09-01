package actividad4;

public class Actividad4 {

    /*
    4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
     */
    public static void main(String[] args) {
        // creamos las dos gallinas
        Gallina gallina1 = new Gallina(01, 7, 25);
        Gallina gallina2 = new Gallina(02, 10, 15);

        //mostramos la informacion inicial.
        gallina1.mostraEstado();
        gallina2.mostraEstado();

        // envejecemos a las gallinas
        gallina1.envejecer(5);
        gallina2.envejecer(5);

        //puesta de huevos
        gallina1.ponerHuevos(19);
        gallina2.ponerHuevos(6);

        // mostramos la informacion actual de las gallinas
        gallina1.mostraEstado();
        gallina2.mostraEstado();
    }

}
