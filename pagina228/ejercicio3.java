package pagina228;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

      
        System.out.println("Introduce 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = sc.nextInt();
            numeros.add(num);
        }

      
        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = 0; j < numeros.size() - 1 - i; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {
                    
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }
        }

        
        System.out.println("\nnumeros ordenados: " + numeros);

        sc.close();
    }
}
