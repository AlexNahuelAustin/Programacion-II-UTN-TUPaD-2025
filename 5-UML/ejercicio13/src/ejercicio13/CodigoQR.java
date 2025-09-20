package ejercicio13;

public class CodigoQR {

    // Declaramos los atributos de la clase
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
