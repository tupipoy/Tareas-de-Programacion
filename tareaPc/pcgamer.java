package tareaPc;

import tareaPc.computadora.Computadora;

public class pcgamer {
    
    public static void main(String[] args) {
        
        teclado miTeclado = new teclado("razer","negro", 60);
        
        pantalla miPantalla = new pantalla();
    
        computadora miComputadoraBase = new computadora();
        Computadora miComputadora = miComputadoraBase.new Computadora(miTeclado, miPantalla);

        miComputadora.encender();
    }
}