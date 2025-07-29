package ejercico2junio22;

public class pagoTarjeta extends transaccion {
    private String numeroTarjeta;

    public pagoTarjeta(double cantidad, String fecha, String numeroTarjeta) {
        super(cantidad, fecha);
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
}
