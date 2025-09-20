package ejercicio10;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private Titutar titutar;
    private ClaveSeguridad clave;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public Titutar getTitutar() {
        return titutar;
    }

    public void setTitutar(Titutar titutar) {
        this.titutar = titutar;
        if (this.titutar != null && this.titutar.getCuenta() != null) {
            titutar.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titutar=" + titutar + ", clave=" + clave + '}';
    }

}
