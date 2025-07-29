package ejercicioenclasedocumento;

public class Documento {
    private String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Imprimiendo el documento: " + nombre);
    }

    public void escribir(String contenido) {
        System.out.println("Escribiendo en el documento: " + contenido);
    }
}

