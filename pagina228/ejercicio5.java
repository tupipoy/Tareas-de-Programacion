package pagina228;

import java.util.ArrayList;
import java.util.Scanner;

class Disco {
    String titulo;
    String artista;
    int anio;

    public Disco(String titulo, String artista, int anio) {
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
    }

    
    public String toString() {
        return "Titulo: " + titulo + ", Artista: " + artista + ", Anio: " + anio;
    }
}

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Disco> discos = new ArrayList<>();

       
        discos.add(new Disco("Moon", "kan", 2019));
        discos.add(new Disco("Blods", "Shawmn", 2021));
        discos.add(new Disco("Purpose", "Justin", 2022));
 
        System.out.println("Coleccion de discos:");
        for (Disco d : discos) {
            System.out.println(d);
        }

        System.out.println("\nIntroduce un nuevo disco:");
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Artista: ");
        String artista = sc.nextLine();
        System.out.print("Anio: ");
        int anio = sc.nextInt();

        discos.add(new Disco(titulo, artista, anio));

       
        System.out.println("\nColeccion actualizada:");
        for (Disco d : discos) {
            System.out.println(d);
        }

        sc.close();
    }
}
