package tareaPc;

public class teclado {
    private String marca;
    private String color;
    private int tamanio;
    
    public teclado(String marca, String color , int tamanio) {
        this.marca = marca;
        this.color = color; 
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void escribir(String texto) 
    {
        System.out.println("escribiendo "+ texto );
    }







}
