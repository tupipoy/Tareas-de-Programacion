package ejercico2junio22;

public class transaccion {
    private double cantidad;
    private String fecha;

   public  transaccion(double cantidad, String fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;


    }

    public double getCantidad() {
        return cantidad;
    }
    
}
