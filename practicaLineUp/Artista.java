package practicaLineUp;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Artista implements DjActions{
    private String logo;
    private String nombre;
    private Player reproductor;
    List<Cancion> canciones = new ArrayList<Cancion>();

    public Artista(String[] datos){
        this.nombre=datos[0];
        this.logo="imagesLineUp/"+datos[0]+".jpg";
        for (int i=1;i<datos.length;i++){
            canciones.add(new Cancion(datos[i]));
        }
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void forzar(){
        reproductor.close();
    }
    @Override
    public void tocarCancion(int i) {
        canciones.get(i).start();
        try {
            Thread.sleep(10000);
            canciones.get(i).stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void controlarEfectos() {

    }
}
