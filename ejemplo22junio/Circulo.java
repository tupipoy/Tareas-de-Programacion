package ejemplo22junio;

public class circulo extends figura {
    private double radio;
    public static double pi = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return pi * (radio * radio);
    }

    public double getCircunferencia() {
        return 2 * pi * radio;
    }
}