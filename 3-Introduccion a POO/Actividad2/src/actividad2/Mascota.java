package actividad2;

public class Mascota {
// nombramos los atributos de la clase

    String Nombre;
    String Especie;
    int Edad;

    public void mascota() {

    }
    // para mostrar la informacion por consola
    public void mostrarInfo() {
        System.out.println("----------Informacion de su mascota----------");
        System.out.println("El nombre de la mascotas es: " + Nombre);
        System.out.println("La especie de la mascotas es: " + Especie);
        System.out.println("La edad de la mascotas es: " + Edad);
    }
    // retornamos la edad actualizada de nuestra mascota
    public int cumplirAnios(int anio) {
        Edad += anio;
        return Edad;
    }

}
