package tareaPc;
import java.util.Scanner;

public class computadora {
  

    public class Computadora{
        private teclado teclado; 
        private pantalla pantalla;
        Scanner s= new Scanner(System.in);
        
        public Computadora(teclado teclado, pantalla pantalla) {
            this.teclado = teclado;
            this.pantalla = pantalla;
        }

        public void encender(){

            System.out.println("presiona 0 para encender la computadora");
            String tecla = s.nextLine();

            teclado.escribir("intentando encender la computadora...");
            if(tecla.equals("0")) {
                pantalla.encender();
                System.out.println("La computadora se ha encendido.");   
        }   else {
                System.out.println("Pantalla no encendida, presiona f1 para encenderla.");
        }

    }
}

}