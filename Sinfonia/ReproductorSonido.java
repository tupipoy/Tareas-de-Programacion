package Sinfonia;

import javax.sound.sampled.*;
import java.io.File;

public class ReproductorSonido {
    public static void reproducir(String nombreArchivo) {
        File archivo = new File(System.getProperty("user.dir") + "/Sinfonia/sounds/" + nombreArchivo);
        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado: " + archivo.getAbsolutePath());
            return;
        }

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
             Clip clip = AudioSystem.getClip()) {
             
            clip.open(audioStream);
            System.out.println("Clip abierto correctamente.");
            clip.start();
            System.out.println("Reproduccion iniciada.");

            while (clip.isRunning()) {
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
