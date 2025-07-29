package tareaPc;

public class pantalla {
    
    private class Pantalla {

        private boolean encendida;

        public Pantalla(){ 
            this.encendida = false;

        }
        public void encender(){
            encendida = true;
            System.out.println("La pantalla se ha encendido.");
           
            System.out.println("¿Está encendida? " + estaEncendida());
        }
        public boolean estaEncendida(){
            return encendida;
        }
    }

    public void encender() {
        Pantalla pantallaInterna = new Pantalla();
        pantallaInterna.encender();
    }
}
