package ejercicio13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);

        if (codigo.getUsuario() != null) {
            System.out.println("Iniciando.............");
            System.out.println("Nombre: " + codigo.getUsuario().getNombre());
            System.out.println("email:" + codigo.getUsuario().getEmail());
            System.out.println("*********Generando su CodigoQR*********");
            System.out.println("Codigo QR... " + codigo.getValor());

        }

    }
}
