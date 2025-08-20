package pagina228;


import java.util.ArrayList;
import java.util.Random;

public class ejercicio2{
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int tamano = rand.nextInt(11) + 10; 

       
        for (int i = 0; i < tamano; i++) {
            numeros.add(rand.nextInt(101)); 
        }

        
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

       
        for (int num : numeros) {
            suma += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

       
        double media = (double) suma / numeros.size();

     
        System.out.println("Números generados: " + numeros);
        System.out.println("Tamaño de la lista: " + numeros.size());
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
