package actividad5;

public class Actividad5 {

    /*
    5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
     */
    public static void main(String[] args) {
        // nombramos al objeto nave
        NaveEspacial nave1 = new NaveEspacial("Estrella de la muerte ", 45);

        // llamamos al metodo despegar 
        nave1.despegar();

        //llamamos al metodo avanzar
        nave1.avanzar(11);

//llamamos el metodo para recargar combustiblr
        nave1.recargarCombustible(31);

        //llamamos al metdo avanzar nuevamente.
        nave1.avanzar(20);

        //mostramos el estado 
        nave1.mostrarEstado();
    }

}
