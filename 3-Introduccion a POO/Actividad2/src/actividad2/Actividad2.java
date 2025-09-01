package actividad2;

/**
 * 2. Registro de Mascotas: a. Crear una clase Mascota con los atributos:
 * nombre, especie, edad. Métodos requeridos: mostrarInfo(), cumplirAnios().
 * Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo
 * y verificar los cambios.
 */
public class Actividad2 {

    public static void main(String[] args) {
        // declaramos el objeto
        Mascota mascota1 = new Mascota();
        mascota1.Nombre = "Milo";
        mascota1.Especie = "Gato";
        mascota1.Edad = 6;

        //mostramos por consola los datos de nuestra mascota
        mascota1.mostrarInfo();

        //simulamos el paso del tiempo y mostramos su nueva edad.
        mascota1.cumplirAnios(4);
        mascota1.mostrarInfo();

    }

}
