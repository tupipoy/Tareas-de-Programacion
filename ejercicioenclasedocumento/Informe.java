package ejercicioenclasedocumento;

import java.util.List;

public class Informe extends Documento {
    private List<Carta> cartas;

    public Informe(String nombre, List<Carta> cartas) {
        super(nombre);
        this.cartas = cartas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (cartas != null && !cartas.isEmpty()) {
            System.out.println("Cartas incluidas en el informe:");
            for (Carta carta : cartas) {
                carta.imprimir();
            }
        } else {
            System.out.println("Este informe no contiene cartas.");
        }
    }
    
}
 