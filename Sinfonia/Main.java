package Sinfonia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instrumento instrumento = null;

        System.out.println("Elige un instrumento para tocar:");
        System.out.println("1. Trompeta");
        System.out.println("2. Bateria");
        System.out.println("3. Guitarra");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                instrumento = new Trompeta();
                break;
            case 2:
                instrumento = new Bateria();
                break;
            case 3:
                instrumento = new Guitarra();
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }

        if (instrumento != null) {
            instrumento.tocar();
        }

        scanner.close();
    }
}
