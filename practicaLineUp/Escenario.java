package practicaLineUp;

import classImosh.Colors;
import classImosh.Dialog;
import classImosh.Screen;

import java.util.ArrayList;
import java.util.List;

public class Escenario extends Thread{
    private String nombre;
    private String logo;
    List<Artista> artistas = new ArrayList<Artista>();

    @Override
    public void run() {
        Screen s = new Screen();
        s.setLocation(300,0);
        s.setSize(320,680);
        for (int i=0; i<artistas.size();i++){
            s.showImage(logo,250,250);
            s.out("\n");
            s.out("Artista Actual: "+artistas.get(i).getNombre()+"\n","Helvetica", 15, Colors.blue);
            s.showImage(artistas.get(i).getLogo(),250,250);
            s.setVisible(true);
            for(int j=0;j<artistas.get(i).getCanciones().size();j++){
                s.out("\nReproduciendo: "+artistas.get(i).getCanciones().get(j).getNombre().substring(12)+"\n","Helvetica", 15, Colors.RED);
                artistas.get(i).tocarCancion(j);
            }
            s.cls();
        }
        s.dispose();
        new Dialog().display("El concierto en el escenario "+nombre+" ha llegado a su fin");
    }

    public Escenario(String nombre){
        this.nombre=nombre;
        this.logo="imagesLineUp/"+nombre+".jpg";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setArtista(String[] a){
        artistas.add(new Artista(a));
    }

    public List<Artista> getArtistas(){
        return artistas;
    }
}
