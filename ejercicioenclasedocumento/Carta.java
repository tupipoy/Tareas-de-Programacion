package ejercicioenclasedocumento;

public class Carta extends Documento {
    private String fecha;
    private String destinatario;

    public Carta(String nombre, String fecha, String destinatario) {
        super(nombre);
        this.fecha = fecha;
        this.destinatario = destinatario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Fecha: " + fecha + ", Destinatario: " + destinatario);
    }
}
