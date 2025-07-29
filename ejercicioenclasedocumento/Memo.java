package ejercicioenclasedocumento;

public class Memo extends Documento {
    private int numeroPaginas;

    public Memo(String nombre, int numeroPaginas) {
        super(nombre);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
