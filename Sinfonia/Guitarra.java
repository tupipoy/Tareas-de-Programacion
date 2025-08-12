package Sinfonia;

public class Guitarra extends Instrumento {
   
    public void tocar() {
        ReproductorSonido.reproducir("guitarra.wav");
    }
}
