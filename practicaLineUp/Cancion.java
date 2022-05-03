package practicaLineUp;


import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class Cancion extends Thread{
    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(nombre);
            Player reproductor = new Player(fis);
            reproductor.play();
        } catch (JavaLayerException | IOException e) {
            e.printStackTrace();
        }
    }

    private String nombre;

    public Cancion(String nombre) {
        this.nombre = "musicLineUp/"+nombre+".mp3";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
