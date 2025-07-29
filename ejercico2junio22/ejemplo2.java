package ejercico2junio22;

public class ejemplo2 {
    public static void main(String[] args) {
        pagoTarjeta pago1 = new pagoTarjeta(100.0, "2023-10-01", "1234-5678-9012-3456");

        System.out.println(pago1.getCantidad());
    }
}
