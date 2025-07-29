package ejercicioenclasedocumento;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear cartas
        Carta carta1 = new Carta("Carta 1", "2025-07-29", "Juan");
        Carta carta2 = new Carta("Carta 2", "2025-07-30", "Ana");

        // Lista de cartas para el informe
        List<Carta> cartas = Arrays.asList(carta1, carta2);

        // Crear documento base
        Documento doc = new Documento("Documento Base");
        doc.imprimir();
        doc.escribir("Este es el contenido del documento base.\n");

        // Crear un memo
        Memo memo = new Memo("Memo Interno", 5);
        memo.imprimir();

        // Crear un informe con cartas
        Informe informe = new Informe("Informe Semanal", cartas);
        informe.imprimir();
    }
}

