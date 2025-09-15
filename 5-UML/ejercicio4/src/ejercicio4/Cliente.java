package ejercicio4;

public class Cliente {

    private String nombre; 
    private int DNI;
    private TarjetaDeCredito tarjeta;
            
            
    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }

    
    
    
}
