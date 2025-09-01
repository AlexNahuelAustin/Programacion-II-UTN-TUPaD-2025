package actividad4;



public class Gallina {
// declararamos los atributos de la gallina
    int idGallina;
    int edad;
    int huevoPuestos;
// creamos el constructor 
    public Gallina(int idGallina, int edad, int huevoPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevoPuestos = huevoPuestos;
    }
    // hacemos los metodo para las las acciones de la gallina
    public void ponerHuevos (int ponerHuevos){
        if (ponerHuevos >= 1) {
            huevoPuestos += ponerHuevos;
        }
        
    }
    
    public void envejecer (int anios){
        if(anios >= 1){
            edad += anios;
        } 
    }
    
    // declaramos la para mostrar la informacion de la gallinas.
   public void mostraEstado(){
       System.out.println("------------Informacion de la gallina------------");
       System.out.println("Id de gallina: " + idGallina);
       System.out.println("Edad de la gallina: " + edad + " años");
       System.out.println("Total de huevos puestos: " + huevoPuestos);
   }
}
