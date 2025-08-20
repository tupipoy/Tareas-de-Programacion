package pagina228;


import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
      
        ArrayList<String> companeros = new ArrayList<>();

     
        companeros.add("Carlos");
        companeros.add("Ana");
        companeros.add("Luis");
        companeros.add("María");
        companeros.add("José");
        companeros.add("Paola");

        for (String nombre : companeros) {
            System.out.println(nombre);
        }
    }
}
