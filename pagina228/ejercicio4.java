package pagina228;


import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

     
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            palabras.add(palabra);
        }

        for (int i = 0; i < palabras.size() - 1; i++) {
            for (int j = 0; j < palabras.size() - 1 - i; j++) {
                if (palabras.get(j).compareTo(palabras.get(j + 1)) > 0) {
                
                    String temp = palabras.get(j);
                    palabras.set(j, palabras.get(j + 1));
                    palabras.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nPalabras ordenadas: " + palabras);

        sc.close();
    }
}
