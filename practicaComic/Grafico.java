package practicaComic;

import classImosh.Screen;

public class Grafico extends Thread{
    int tiempo=5000;
    Screen s = new Screen();

    public  Grafico(int tiempo){
        this.tiempo=tiempo;
        s.setLocation(0,0);
        s.setSize(490,710);
    }

    @Override
    public void run() {
        s.setVisible(true);
        int i=8;
        while (i<16){
            mostrarGrafico(nombreImagen(i));
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.cls();
            i++;
        }
        System.exit(0);
    }

    public void mostrarGrafico(String imagen){
        s.setTitle("Pagina No. "+((Integer.parseInt(imagen.substring(18,21))-7)));
        s.showImage(imagen, 450, 650);
    }

    public String nombreImagen(int i){
        if(i<10){
            return "imagesComic/Halo__00"+i+".jpg";
        }else{
            return "imagesComic/Halo__0"+i+".jpg";
        }
    }
}
