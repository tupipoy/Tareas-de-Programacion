package pagina228;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Base de datos de usuarios y contraseñas
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("admin", "4232");
        usuarios.put("alex", "clavealex");
        usuarios.put("maria", "maria25");

        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Contrasenia: ");
            String contrasena = sc.nextLine();

            // Verificar credenciales
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
                acceso = true;
                System.out.println("\n Ha accedido al area restringida.");
            } else {
                intentos--;
                System.out.println(" Usuario o contrasenia incorrectos. Te quedan " + intentos + " intentos.");
            }
        }

        if (!acceso) {
            System.out.println("\n Lo siento, no tiene acceso al area restringida.");
        }

        sc.close();
    }
}
